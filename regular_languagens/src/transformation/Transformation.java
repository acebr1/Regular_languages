//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package transformation;

import interfaceWindows.MainWindow;
import finite_automaton.*;
import regular_expression.*;
import regular_grammar.*;
import interfaceWindows.MainWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Transformation {
    ArrayList<FiniteAutomaton> listFA;
    ArrayList<RegularExpression> listRE;
    ArrayList<RegularGrammar> listRG;
    FA_algorithms alg;
    RG_Algorithms rgalg;
    MainWindow mw = null;
/*
 * Construtor sem parâmetros com inicilização das listas
 */
    public Transformation(MainWindow mw){
        this.alg = new FA_algorithms();
        this.rgalg = new RG_Algorithms();
        listRG = new ArrayList<>();
        listRE = new ArrayList<>();
        listFA = new ArrayList<>();
        this.mw = mw;
        
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
        gnew.setName("FA:"+FAClone.getName());
        addNewRegularGrammar(gnew);
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
        FiniteAutomaton fnew = new FiniteAutomaton(states, alphabet, initial, "RG:"+GClone.getName());
        addNewFiniteAutomaton(fnew);
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
        FiniteAutomaton fa = new FiniteAutomaton(states, alf, initial,e.getExpression());
        addNewFiniteAutomaton(fa);
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
        a3.setName("Intersecção "+a1.getName()+","+a2.getName());
        addNewFiniteAutomaton(a3);
    }
    
/**
   * @return Finite automaton resulting from the Intersection the Regular Expressions
*/
    public void Intersection(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        a3.setName("Intersecção "+a1.getName()+","+a2.getName());
        addNewFiniteAutomaton(a3);
    }
 
/**
   * @return Finite automaton resulting from the difference the Regular Grammars
*/
    public void Difference(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        a3.setName("Diferença "+a1.getName()+","+a2.getName());
        addNewFiniteAutomaton(a3);
    }

/**
   * @return Finite automaton resulting from the difference the Regular Expressions
*/
    public void Difference(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        System.out.println(a3);
        a3.setName("Diferença "+a1.getName()+","+a2.getName());
        addNewFiniteAutomaton(a3);
    }

/**
   * @return Finite automaton resulting from the reverse the Regular Grammars
*/    
    public void Reverse(RegularGrammar g1) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a3 = alg.reverse(a1);
        a3.setName("Reverso "+a1.getName());
        addNewFiniteAutomaton(a3);
    }
    
/**
   * @return Finite automaton resulting from the reverse the Regular Expression
*/
    public void Reverse(RegularExpression e1) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a3 = alg.reverse(a1);
        a3.setName("Reverso "+a1.getName());
        addNewFiniteAutomaton(a3);
    }
    
    public void addNewFiniteAutomaton(FiniteAutomaton f){
        for(FiniteAutomaton fa: listFA){
            if(fa.getName().equals(f.getName()))
                return;
        }
        listFA.add(f);
        mw.mapFA.put(f.getName(), f);
        mw.atualiza();
    }
    
    public void addNewRegularExpression(RegularExpression f){
        for(RegularExpression re: listRE){
            if(re.getExpression().equals(f.getExpression()))
                return;
        }
        mw.mapRE.put(f.regularExpression, f);
        listRE.add(f);
        mw.atualiza();
    }
    
    public void addNewRegularGrammar(RegularGrammar f){
        for(RegularGrammar rg: listRG){
            if(rg.getName().equals(f.getName()))
                return;
        }
        listRG.add(f);
        if(!mw.mapRG.containsKey(f.getName()))
            mw.mapRG.put(f.getName(), f);
        mw.atualiza();
    }
    
    public void RemoveFiniteAutomaton(FiniteAutomaton f){
        //System.out.println(f);
        ///System.out.println(listFA);
        //System.out.println(listFA.contains(f));
        listFA.remove(f);
        //System.out.println(listFA);
        mw.atualiza();
    }
    
    public void RemoveRegularExpression(RegularExpression f){
        listRE.remove(f);
        
        mw.atualiza();
    }
    
    public void RemoveRegularGrammar(RegularGrammar f){
        listRG.remove(f);
        if(mw.mapRG.containsKey(f.getName()))
            mw.mapRG.remove(f.getName(), f);
        mw.atualiza();
    }
    
    public ArrayList<FiniteAutomaton> getListFA(){
        return listFA;
    }
    
    public ArrayList<RegularExpression> getListRE(){
        return listRE;
    }
    
    public ArrayList<RegularGrammar> getListRG(){
        return listRG;
    }
    
    public void union(RegularGrammar g1, RegularGrammar g2){
        addNewRegularGrammar(rgalg.union(g1, g2));
    }
    
    public void concatenation(RegularGrammar g1, RegularGrammar g2){
        addNewRegularGrammar(rgalg.concatenation(g1, g2));
    }
    
    public void closure (RegularGrammar g1){
        addNewRegularGrammar(rgalg.closure(g1));
    }
}
