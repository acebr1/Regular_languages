//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package transformation;

import finite_automaton.*;
import regular_expression.*;
import regular_grammar.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Transformation {
    protected ArrayList<FiniteAutomaton> listFA;
    protected ArrayList<RegularExpression> listRE;
    protected ArrayList<RegularGrammar> listRG;
    FA_algorithms alg;
 
/*
 * Construtor sem parâmetros com inicilização das listas
 */
    public Transformation(){
        this.alg = new FA_algorithms();
        listRG = new ArrayList<>();
        listRE = new ArrayList<>();
        listFA = new ArrayList<>();
        
    }
 
/*
 * Conversão de autômato finito para gramática regular
 */
    public RegularGrammar AFtoRG(FiniteAutomaton f){
        FiniteAutomaton FAClone = f.getClone();
	RegularGrammar gnew = new RegularGrammar();
        gnew.setInitialSymbol("S");
        ArrayList<State> states = FAClone.getStates();
        State initial = FAClone.getInitial();
        Map<State,String> StaToStr = new HashMap<>();
        char name = 'A';
        for(State s: states){
            if(name == 'S') name++;
            StaToStr.put(s, ""+name);
            name++;
        }
        for(Character c: initial.getTransitions().keySet()){
            ArrayList<State> list2 = initial.getListStates(c);
            for(State s: list2){
                gnew.setProductions("S", c+StaToStr.get(s));
                if(s.getIsFinal()){
                    gnew.setProductions("S",c+"");
                }
            }
            if(initial.getIsFinal()){
                gnew.setProductions("S", "&");
            }
        }
        for(State s : states) {
            Set<Character> list = s.getTransitions().keySet();
            for(Character key : list ){
                ArrayList<State> list2 = s.getTransitions().get(key);
                for(State s2 : list2){
                    gnew.setProductions(StaToStr.get(s), key + StaToStr.get(s2));
                    if(s2.getIsFinal()){
                        gnew.setProductions(StaToStr.get(s), key+"");
                    }
                }
                
            }
            
        }
        listRG.add(gnew);
        return gnew;
    }

/*
 * Conversão de gramática regular para autômato finito
 */    
    public FiniteAutomaton RGtoAF(RegularGrammar g){
        RegularGrammar GClone = g.getClone();
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<State> states = new ArrayList<>();
        Map<String,State> StrToSta = new HashMap<>();
        State initial = null;
        Map<String, ArrayList<String>> productions = GClone.getProductions();
        int n=1;
        for (String key : productions.keySet()){
            if(key.equals(GClone.getInitialSymbol())){
                initial = new State("q0", false);
                ArrayList<String> l = productions.get(GClone.getInitialSymbol());
                if(l.contains("&")) initial.setIsFinal(true);
                states.add(initial);
                StrToSta.put(key, initial);
            }else {
                State newS = new State("q"+n++, false);
                StrToSta.put(key, newS);
                states.add(newS);
            }
        }
        //Create state final
        State finalS = new State("q"+n++,true);
        states.add(finalS);
        
        for (String key : productions.keySet()){
            ArrayList<String> list = productions.get(key);
            for(String s : list){
                if(!alphabet.contains(s.charAt(0)) && s.charAt(0)!= '&')
                    alphabet.add(s.charAt(0));
                if(s.length() == 2){
                    StrToSta.get(key).setTransitions(s.charAt(0), StrToSta.get(s.charAt(1)+""));
                }
                if(s.length() == 1){
                    StrToSta.get(key).setTransitions(s.charAt(0), finalS);
                }
            }
        }
        
        FiniteAutomaton fnew = new FiniteAutomaton(states, alphabet, initial, "AF:"+GClone.getName());
        listFA.add(fnew);
        return fnew;
    }
 
/*
 * Conversão de expressão regular para autômato finito
 */
    public FiniteAutomaton DeSimone(RegularExpression e) {
        Parser p = new Parser(e);
        Node root = p.parse();
        p.thread(root);
            
        Set<Node> comp = new HashSet<>();
        Set<Node> all = new HashSet<>();
        ArrayList<Character> alf = new ArrayList<>();
        HashMap<Node,Set<Node>> leafComp = new HashMap<>();
        HashMap<State,Set<Node>> stateComp = new HashMap<>();
            
        root.subTree(all);
            for(Node n: all){
                if(n.getLabel() != -1){
                    n.right.up(comp);
                    for(Node n1: all){
                        n1.clear();
                    }
                    leafComp.put(n, comp);
                    comp = new HashSet<>();
                    
                    if(!alf.contains(n.symbol)){
                        alf.add(n.symbol);
                    }
                }
            }
        State initial = new State("q0", false);
        root.down(comp);
        stateComp.put(initial, comp);
        int iterator = 0;
        int numberStates = 1;
        ArrayList<State> states = new ArrayList<>();
        states.add(initial);
            
        while(iterator < numberStates){
            for(Character c:alf){
                Set<Node> temp = new HashSet<>();
                for(Node n: stateComp.get(states.get(iterator))) {
                    if(n.symbol == c){
                        temp.add(n);
                    }
                }
                if(!temp.isEmpty()) {
                    Set<Node> newComp = getComposition(temp, leafComp);
                    if(stateComp.containsValue(newComp)){
                        Set<State> set = stateComp.keySet();
                        for(State s: set) {
                            if(stateComp.get(s).equals(newComp)) {
                                states.get(iterator).setTransitions(c, s);
                            }
                        }
                    } else {
                        State newState = new State("q"+numberStates++, false); 
                        states.add(newState);
                        stateComp.put(newState, newComp);
                        states.get(iterator).setTransitions(c, newState);
                    }

                }
            }
            iterator++;
        }
   
        for(State s: stateComp.keySet()){
            for(Node n: stateComp.get(s)){
                if(n.symbol == '&')
                    s.setIsFinal(true);
            }
        }
        FiniteAutomaton fa = new FiniteAutomaton(states, alf, initial, e.name+"AFD");
        listFA.add(fa);
        return fa;
    }
    
/*
 * Pegar composição dos nodos da árvore costurada
 */
    private Set<Node> getComposition(Set<Node> setNodes, HashMap<Node,Set<Node>> leafComp){
        Set<Node> comp = new HashSet<>();
        for(Node n: setNodes) {
            comp.addAll(leafComp.get(n));
        }
        return comp;
    }
 
/**
   * @return Finite automaton resulting from the Intersection the Regular Grammars
*/
    public void Intersection(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    
/**
   * @return Finite automaton resulting from the Intersection the Regular Expressions
*/
    public void Intersection(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        System.out.println(a3);
        listFA.add(a3);
    }
 
/**
   * @return Finite automaton resulting from the difference the Regular Grammars
*/
    public void Difference(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        listFA.add(a3);
    }

/**
   * @return Finite automaton resulting from the difference the Regular Expressions
*/
    public void Difference(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        System.out.println(a3);
        listFA.add(a3);
    }

/**
   * @return Finite automaton resulting from the reverse the Regular Grammars
*/    
    public void Reverse(RegularGrammar g1) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a3 = alg.reverse(a1);
        listFA.add(a3);
    }
    
/**
   * @return Finite automaton resulting from the reverse the Regular Expression
*/
    public void Reverse(RegularExpression e1) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a3 = alg.reverse(a1);
        listFA.add(a3);
    }
        
}
