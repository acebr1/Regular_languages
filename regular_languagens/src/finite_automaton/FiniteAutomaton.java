package finite_automaton;
import java.util.ArrayList;

public class FiniteAutomaton{

        FiniteAutomaton deterministic;
        FiniteAutomaton minimized;
        FiniteAutomaton complement;
        FiniteAutomaton reverse;
        FiniteAutomaton complete;
        FiniteAutomaton noEpsilon;
        
	protected ArrayList<State> states;
	protected ArrayList<Character> alphabet;
	protected State initial;
	public String name = "";

/**
   * Constructor.
*/
        public FiniteAutomaton() {
            
        }
        
	public FiniteAutomaton(ArrayList<State> states, ArrayList<Character> alphabet, State initial, String name) {
		this.states = states;
		this.alphabet = alphabet;
		this.initial = initial;
                this.name = name;
	}
        
        public State getInitial() {
            return initial;
        }
        
        public void setDeterministic (FiniteAutomaton f) {
            this.deterministic = f;
        }
        
        public void setMinimized (FiniteAutomaton f) {
            this.minimized = f;
        }
        
        public void setComplement (FiniteAutomaton f) {
            this.complement = f;
        }
        
        public void setReverse (FiniteAutomaton f) {
            this.reverse = f;
        }
        
        public void setComplete (FiniteAutomaton f) {
            this.complete = f;
        }
        
        public void setNoEpsilon (FiniteAutomaton f) {
            this.noEpsilon = f;
        }
        
        public FiniteAutomaton getComplete() {
            return this.complete;
        }
        
        public FiniteAutomaton getNoEpsilon() {
            return this.noEpsilon;
        }
        
        public FiniteAutomaton getDeterministic() {
            return this.deterministic;
        }
        
        @Override
        public String toString(){
            String resp = "Name:"+name+"\nStates:"+states+"\nTransitions:\n";
            //System.out.println(resp);
            for(State s : states) {
                for(Character key : s.transition.keySet()){
                    if(s.isFinal) resp += "*";
                    resp += s+"("+key+","+s.transition.get(key)+")\n";
                }  
            }
            return resp;
        }
        
        public String getName(){
            return this.name;
        }
        
        public FiniteAutomaton getClone(){
            ArrayList<State> copy = new ArrayList<>();
            State initialCopy = null;
            
            for(State s : states) {
                State stateCopy = new State(s.getName()+"", s.isFinal);
                if(s.equals(initial)) {
                    initialCopy = stateCopy;
                }
                copy.add(stateCopy);
            }
            for(State s: states) {
                State copyR = null;
                for(State sCopy: copy) {
                    if(s.getName().equals(sCopy.getName()))
                        copyR = sCopy;
                }
                for(Character c: s.transition.keySet()) {
                    ArrayList<State> l = s.transition.get(c);
                    for(State s1: l) {
                        State copy2 = null;
                        for(State s2: copy) {
                            if(s1.getName().equals(s2.getName())){
                                copy2 = s2;
                            }
                
                        }
                        copyR.setTransitions(c, copy2);
                    }  
                }
            }
            ArrayList<Character> c = new ArrayList<>();
            for(Character a: alphabet) {
                c.add(a.charValue());
            }
            return new FiniteAutomaton(copy,c,initialCopy,getName());
        }
       
}
