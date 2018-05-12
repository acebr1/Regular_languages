package finite_automaton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FA_algorithms {

/**
   * Constructor.
*/
        public FA_algorithms() {}


/**
   * @return Is deterministic?
*/
	public boolean isDeterministic(FiniteAutomaton f) {
            for(State s : f.states) {
                for(Character c: f.alphabet){
                    if(s.transition.containsKey(c) && s.getListStates(c).size() > 1)
                        return false;
                }
            }
            return true;
    	}

/**
   * @return Is complete?
*/
	public boolean isComplete(FiniteAutomaton f) {
            for(State s : f.states) {
                for(Character c: f.alphabet){
                    if(!s.transition.containsKey(c) || s.getListStates(c).size() == 0)
                        return false;
                }
            }
            return true;
	}

/**
   * @return finite automaton deterministic
*/
	public void determinize(FiniteAutomaton f) {
            f.setDeterministic(new FiniteAutomaton());
	}
        
/**
   * @return finite automaton complete
*/
	public FiniteAutomaton complete(FiniteAutomaton f) {
            FiniteAutomaton complete = new FiniteAutomaton(f.states, f.alphabet, f.initial);
            State ErrorState = new State("ErrorState", false);
            for(Character c: complete.alphabet) {
                ErrorState.setTransitions(c, ErrorState);
            }
            for(State s: complete.states) {
                for(Character c: complete.alphabet) {
                    if(!s.transition.containsKey(c) || s.getListStates(c).size() == 0){
                        s.setTransitions(c, ErrorState);
                    }
                }
            }
            f.setComplete(complete);
            return complete;
	}

/**
   * @return finite automaton minimum
*/
	public FiniteAutomaton minimize(FiniteAutomaton f) {
            //f.setMinimized (new FiniteAutomaton());
            return f;
	}

/**
   * @return finite automaton without unreachable states
*/
	public FiniteAutomaton remove_unreachable(FiniteAutomaton f) {
            return new FiniteAutomaton();
	}

/**
   * @return finite automaton without dead states
*/
	public FiniteAutomaton remove_dead(FiniteAutomaton f) {
            return new FiniteAutomaton();
	}   

/**
   * @return finite automaton withot equivalent states
*/
	public FiniteAutomaton equivalent_state(FiniteAutomaton f) {
            return new FiniteAutomaton();
	}
/**
   * Used in intersection() and difference()
   * @return Finite automaton resulting from the union
*/
	public FiniteAutomaton union(FiniteAutomaton fa, FiniteAutomaton fb) {
            return new FiniteAutomaton();
	}

/**
   * Used in intersection() and difference()
   * @return Finite Automaton resulting from the complement
*/
	public FiniteAutomaton complement(FiniteAutomaton f) {
            f.setComplement(new FiniteAutomaton());
            return new FiniteAutomaton();
	}

/**
   * @return Finite Automaton resulting from the intersection
*/
	public FiniteAutomaton intersection(FiniteAutomaton fa, FiniteAutomaton fb) {
            return complement(union(complement(fa), complement(fb)));
	}

/**
   * @return Finite Automaton resulting from the difference
*/
	public FiniteAutomaton difference(FiniteAutomaton fa, FiniteAutomaton fb) {
            return intersection(fa, complement(fb));
	}

/**
   * @return Finite Automaton resulting from the reverse
*/
	public FiniteAutomaton reverse(FiniteAutomaton f) {
            f.setReverse(new FiniteAutomaton());
            return new FiniteAutomaton();
	}

/**
   * @return Finite Automaton to recognize sentence?
*/
	public boolean recognize(FiniteAutomaton f, String sentence) {
            return true;
	}

/**
   * @return Finite Automaton to recognize sentence in size?
*/
	public ArrayList<String> enumeration(FiniteAutomaton fa, int size) {
            ArrayList<String> list = new ArrayList<String>();
            return list;
	}
}
