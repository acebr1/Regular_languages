package finite_automaton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


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
	public FiniteAutomaton determinize(FiniteAutomaton f) {
            if(isDeterministic(f)) {
                f.setDeterministic(f);
                return f;
            }
            FiniteAutomaton FAClone = f.getClone();
            
            ArrayList<State> newStates = new ArrayList<>();
            Map<Set<State>,State> equiv = new HashMap<>();
            Map<State,Set<State>> equiv2 = new HashMap<>();
            
            State initial = new State(FAClone.initial.toString(),false);
            newStates.add(initial);
            
            Set<State> help = new HashSet<>();
            help.add(initial);
            equiv.put(help, initial);
            equiv2.put(initial, help);
            int iterator = 0;
            int number_states = 1;
            
            while(number_states > iterator) {
                for(Character c : FAClone.alphabet) {
                    Set<State> statesEquiv = equiv2.get(newStates.get(iterator));
                    Set<State> set = new HashSet<>();
                    for(State s: statesEquiv) {
                        int i = -1;
                        for(State sf : FAClone.states) {
                            if(sf.toString().equals(s.toString())){
                                i = FAClone.states.indexOf(sf);
                            }
                        }
                      
                        if(FAClone.states.get(i).transition.containsKey(c)) {
                            ArrayList<State> alc = FAClone.states.get(i).getListStates(c);
                            for(State s1 : alc){
                                if(!set.contains(s1))
                                    set.add(s1);
                            }
                        }
                    }
                    if(!set.isEmpty()) {
                        if(!equiv.containsKey(set)) {
                            State newState = new State("q"+number_states, false);
                            newStates.add(newState);
                            number_states++;
                            equiv.put(set,newState);
                            equiv2.put(newState,set);
                            newStates.get(iterator).setTransitions(c, newState);
                        } else {
                            newStates.get(iterator).setTransitions(c, equiv.get(set));
                        }
                    }
                }
                iterator++;
            }
            for(State s: FAClone.states) {
                if(s.isFinal){
                    for(State s1: newStates) {
                        Set<State> list = equiv2.get(s1);
                        for(State l: list){
                            if(l.toString().equals(s.toString())){
                                s1.setIsFinal(true);
                            }
                        }
                    }
                }
            }
            
            FiniteAutomaton determinized = new FiniteAutomaton(newStates, FAClone.alphabet, initial);
            f.setDeterministic(determinized);
            return determinized;
	}
        
/**
   * @return finite automaton complete
*/
	public FiniteAutomaton complete(FiniteAutomaton f) {
            //FiniteAutomaton complete = new FiniteAutomaton(f.states, f.alphabet, f.initial);
            FiniteAutomaton complete = f.getClone();
            State ErrorState = new State("Error", false);
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
