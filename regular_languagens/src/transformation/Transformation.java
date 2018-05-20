package transformation;

import finite_automaton.*;
import regular_expression.*;
import regular_grammar.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 
 */

public class Transformation {
    protected ArrayList<FiniteAutomaton> listFA;
    protected ArrayList<RegularExpression> listRE;
    protected ArrayList<RegularGrammar> listRG;
    FA_algorithms alg;
    
    public Transformation(){
        this.alg = new FA_algorithms();
        listRG = new ArrayList<>();
        listRE = new ArrayList<>();
        listFA = new ArrayList<>();
        
    }
    
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
    
    public FiniteAutomaton RGtoAF(RegularGrammar g){
        RegularGrammar GClone = g.getClone();
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<State> states = new ArrayList<>();
        Map<String,State> StrToSta = new HashMap<>();
        State initial = null;
        Map<String, ArrayList<String>> productions = GClone.getProductions();
        for (String key : productions.keySet()){
            if(key.equals(GClone.getInitialSymbol())){
                initial = new State(GClone.getInitialSymbol(), false);
                ArrayList<String> l = productions.get(GClone.getInitialSymbol());
                if(l.contains("&")) initial.setIsFinal(true);
                states.add(initial);
                StrToSta.put(key, initial);
            }else {
                State newS = new State(key, false);
                StrToSta.put(key, newS);
                states.add(newS);
            }
        }
        for (String key : productions.keySet()){
            ArrayList<String> list = productions.get(key);
            for(String s : list){
                if(!alphabet.contains(s.charAt(0)) && s.charAt(0)!= '&')
                    alphabet.add(s.charAt(0));
                if(s.length() == 2){
                    StrToSta.get(key).setTransitions(s.charAt(0), StrToSta.get(s.charAt(1)+""));
                    if(list.contains(""+s.charAt(0))) 
                        StrToSta.get(s.charAt(1)+"").setIsFinal(true);
                }
            }
        }
        
        FiniteAutomaton fnew = new FiniteAutomaton(states, alphabet, initial, "");
        listFA.add(fnew);
        return fnew;
    }
    
    public FiniteAutomaton DeSimone(RegularExpression e) {
        return new FiniteAutomaton();
    }
    
    public void Intersection(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    public void Intersection(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.intersection(a1, a2);
        listFA.add(a3);
    }
    
    public void Difference(RegularGrammar g1, RegularGrammar g2) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a2 = RGtoAF(g2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        listFA.add(a3);
    }
    public void Difference(RegularExpression e1, RegularExpression e2) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a2 = DeSimone(e2);
        FiniteAutomaton a3 = alg.difference(a1, a2);
        listFA.add(a3);
    }
    
    public void Reverse(RegularGrammar g1) {
        FiniteAutomaton a1 = RGtoAF(g1);
        FiniteAutomaton a3 = alg.reverse(a1);
        listFA.add(a3);
    }
    public void Reverse(RegularExpression e1) {
        FiniteAutomaton a1 = DeSimone(e1);
        FiniteAutomaton a3 = alg.reverse(a1);
        listFA.add(a3);
    }
    
    //falta diferença e reverso
        
}
