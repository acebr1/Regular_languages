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
            help.add(FAClone.initial);
            equiv.put(help, initial);
            equiv2.put(initial, help);
            int iterator = 0;
            int number_states = 1;
            
            while(number_states > iterator) {
                for(Character c : FAClone.alphabet) {
                    Set<State> statesEquiv = equiv2.get(newStates.get(iterator));
                    Set<State> set = new HashSet<>();
                    for(State s: statesEquiv) {
                        if(s.transition.containsKey(c)) {
                            ArrayList<State> alc = s.getListStates(c);
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
            
            FiniteAutomaton determinized = new FiniteAutomaton(newStates, FAClone.alphabet, initial,"AFD:"+FAClone.getName());
            //System.out.println(determinized);
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
            complete.states.add(ErrorState);
            for(Character c: complete.alphabet) {
                ErrorState.setTransitions(c, ErrorState);
            }
            for(State s: complete.states) {
                for(Character c: complete.alphabet) {
                    if(!s.transition.containsKey(c) || s.getListStates(c).isEmpty()){
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
            /*if (!isDeterministic(f))
                determinize(f);
            remove_unreachable(f);
            remove_dead(f);
            equivalent_state(f);
            f.setMinimized (new FiniteAutomaton());
            union states equivalents*/
            return f;
	}

/**
   * @return finite automaton without unreachable states
*/
	public FiniteAutomaton remove_unreachable(FiniteAutomaton f) {
            /**ArrayList<State> reachable = new ArrayList<>();
            reachable.add(f.getInitial());
            boolean temp = true;
            while(temp){
                int size_re = reachable.size();
                for(State s : reachable){
                    for(char a : f.alphabet) {
                        reachable.addAll(s.getListStates(a));
                    }
                }
                if(size_re == reachable.size())
                    temp = false;
            }
            
            return new FiniteAutomaton(reachable, f.alphabet, f.getInitial());*/
            return new FiniteAutomaton();
	}

/**
   * @return finite automaton without dead states
*/
	public FiniteAutomaton remove_dead(FiniteAutomaton f) {
            /**ArrayList<State> alive = new ArrayList<>();
            ArrayList<State> temp = new ArrayList<>();
            for(State s : f.states) {
                if (s.getIsFinal()){
                    alive.add(s);
                } else {
                    for (char a : f.alphabet) {
                        temp = s.getListStates(a);
                        alive.addAll(remove_dead_aux(f, temp));
                    }
                }
            }   
            return new FiniteAutomaton(alive,f.alphabet, f.getInitial());*/
            return new FiniteAutomaton();
	}   
        public ArrayList<State> remove_dead_aux(FiniteAutomaton f, ArrayList<State> aux){
            ArrayList<State> alive_aux = new ArrayList<>();
            /**ArrayList<State> temp = new ArrayList<>();
            for (State s : aux) {
                if (s.getIsFinal()){
                    alive_aux.add(s);
                } else {
                    for (char a : f.alphabet) {
                        temp = s.getListStates(a);
                        alive_aux.addAll(remove_dead_aux(f,temp));
                    }
                }
            }*/
            return alive_aux;
        }
        
/**
   * @return finite automaton withot equivalent states
*/
	public FiniteAutomaton equivalent_state(FiniteAutomaton f) {
            /**ArrayList<ArrayList> group = new ArrayList<>();
            ArrayList<State> accept = new ArrayList<>();
            ArrayList<State> reject = new ArrayList<>();
            ArrayList<State> accept_aux = new ArrayList<>();
            group.add(accept);
            group.add(reject);
            for (State s : f.states){
                if (s.getIsFinal()){
                    accept.add(s);
                    accept_aux.add(s);
                } else {
                    reject.add(s);
                }
            }
            while(accept_aux != null) {
                int i = 0;
                accept_aux.remove(i);
                i++;
                for (char a : f.alphabet){
                }
            }*/
            return new FiniteAutomaton();
	}
/**
   * Used in intersection() and difference()
   * @return Finite automaton resulting from the union
*/
	public FiniteAutomaton union(FiniteAutomaton fa, FiniteAutomaton fb) {
            FiniteAutomaton FAclone = fa.getClone();
            FiniteAutomaton FBclone = fb.getClone();
            for(State s: FAclone.states) {
                s.setName(s.getName()+"A");
            }
            for(State s: FBclone.states) {
                s.setName(s.getName()+"B");
            }
            State newInitial = new State("q0",false);
            if(FAclone.initial.isFinal || FBclone.initial.isFinal) 
                newInitial.setIsFinal(true);
            for(Character c: FAclone.initial.transition.keySet()) {
                ArrayList<State> list = FAclone.initial.transition.get(c);
                for (State s: list)
                    newInitial.setTransitions(c, s);
            }
            for(Character c: FBclone.initial.transition.keySet()) {
                ArrayList<State> list = FBclone.initial.transition.get(c);
                for (State s: list)
                    newInitial.setTransitions(c, s);
            }
            ArrayList<State> unionStates = new ArrayList<>();
            unionStates.add(newInitial);
            for(State s: FAclone.states) {
                unionStates.add(s);
            }
            for(State s: FBclone.states) {
                unionStates.add(s);
            }
            if(!FAclone.alphabet.equals(FBclone.alphabet))
                return null;
            
            FiniteAutomaton union = new FiniteAutomaton(unionStates, FAclone.alphabet, newInitial,FAclone.getName()+"|"+FBclone.getName());
            //System.out.println(union);
            return union;
	}

/**
   * Used in intersection() and difference()
   * @return Finite Automaton resulting from the complement
*/
	public FiniteAutomaton complement(FiniteAutomaton f) {
            FiniteAutomaton fClone = f.getClone();
            if(!isComplete(fClone)){
                fClone = complete(fClone);
            }
            for(State s: fClone.states) {
                s.setIsFinal(!s.isFinal);
            }
            f.setComplement(fClone);
            return fClone;
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
            FiniteAutomaton FClone;
            if(!isDeterministic(f)) {
                FClone = determinize(f);
            } else {
                FClone = f.getClone();
            }
            //retirar & transições
            State actual = FClone.initial;
            while(sentence.length() > 0) {
                char c = sentence.charAt(0);
                if(actual.transition.containsKey(c)){
                    ArrayList<State> state = actual.getListStates(c);
                    if(state.size() == 1){
                        actual = state.get(0);
                        sentence = sentence.substring(1);
                    }else {
                        System.out.println("Isn't deterministic");
                    }
                } else {
                    return false;
                }
            }
            if(actual.isFinal){
                return true;  
            } else {
                return false;
            }
            
	}

/**
   * @return Finite Automaton to recognize sentence in size?
*/
	public ArrayList<String> enumeration(FiniteAutomaton fa, int size) {
            ArrayList<String> list = new ArrayList<String>();
            return list;
	}
        
        
/**
 * * @return Finite Automaton without & transitions
 */
        public FiniteAutomaton removeEpsilonTrasitions(FiniteAutomaton f){
            if(!hasEpsilonTrasitions(f))
                return f;
            for(State s: f.states) {
                if(s.transition.containsKey('&')) {
                    ArrayList<State> next = s.transition.get('&');
                    for(State s1: f.states) {
                        if(s1.transition.containsKey(s)){
                            for(Character c: s1.transition.keySet()) {
                                ArrayList<State> list = s1.transition.get(c);
                                for(State s2: list){
                                    if(s2.equals(s)) {
                                        list.remove(s);
                                        list.add(next.get(0));
                                        s1.setTransitions(c, list);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //apenas para não gerar erro
            return f;
        }

        /**
 * * @return true if AF has & transition
 */
        public boolean hasEpsilonTrasitions(FiniteAutomaton f){
            for(State s: f.states) {
                if(s.transition.containsKey('&'))
                    return true;
            }
            return false;
        }

}

