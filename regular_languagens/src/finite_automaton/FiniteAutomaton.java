package finite_automaton;
import java.util.ArrayList;

public class FiniteAutomaton{

        FiniteAutomaton deterministic;
        FiniteAutomaton minimized;
        FiniteAutomaton complement;
        FiniteAutomaton reverse;
        FiniteAutomaton complete;
        
	protected ArrayList<State> states;
	protected ArrayList<Character> alphabet;
	protected State initial;
	public String name = "";

/**
   * Constructor.
*/
        public FiniteAutomaton() {
            
        }
        
	public FiniteAutomaton(ArrayList<State> states, ArrayList<Character> alphabet, State initial) {
		this.states = states;
		this.alphabet = alphabet;
		this.initial = initial;
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
        
        public FiniteAutomaton getComplete() {
            return this.complete;
        }
       
}
