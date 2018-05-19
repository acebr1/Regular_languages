package transformation;

import finite_automaton.*;
import regular_expression.*;
import regular_grammar.*;
import java.util.ArrayList;
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
    }
    
    public RegularGrammar AFtoRG(FiniteAutomaton f){
        FiniteAutomaton FAClone = f.getClone();
	RegularGrammar gnew = new RegularGrammar();
        gnew.setInitialSymbol(FAClone.getInitial().getName());
        ArrayList<State> states = FAClone.getStates();
        for(State s : states) {
            Set<Character> list = s.getTransitions().keySet();
            for(Character key : list ){
                ArrayList<State> list2 = s.getTransitions().get(key);
                for(State s2 : list2){
                    gnew.setProductions((String) s.getName(), (String) (key + s.getName()));
                    if(s2.getIsFinal()){
                        gnew.setProductions((String) s.getName(), (String) key.toString());
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
        State initial = new State(GClone.getInitialSymbol(), false);
        states.add(initial);
        for (String key : GClone.getProductions().keySet()){
            State st = new State(key, false);
            ArrayList<String> list = GClone.getProductions().get(key);
            for(String s : list){
                alphabet.add(s.charAt(0));
                if(s.charAt(1) == ' '){
                    st.setIsFinal(true);
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
