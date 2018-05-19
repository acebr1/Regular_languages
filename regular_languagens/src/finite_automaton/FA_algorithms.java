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
            FiniteAutomaton FAClone = f.getClone();
            if(hasEpsilonTrasitions(FAClone)) {
                //System.out.println(FAClone);
                FAClone = removeEpsilonTrasitions(FAClone);
                //System.out.println(FAClone);
            }
            if(isDeterministic(FAClone)) {
                f.setDeterministic(f);
                return FAClone;
            }

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
            if(isComplete(f))
                return f.getClone();
            
            FiniteAutomaton complete = f.getClone();
            State ErrorState = new State("Þ", false);
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
            FiniteAutomaton FClone = f.getClone();
            if (!isDeterministic(FClone))
                FClone = determinize(FClone);
            FiniteAutomaton resp = equivalent_state(remove_dead(remove_unreachable(FClone)));
            f.setMinimized(resp);
            return resp;
	}

/**
   * @return finite automaton without unreachable states
*/
	public FiniteAutomaton remove_unreachable(FiniteAutomaton f) {
            ArrayList<State> reachable = new ArrayList<>();
            FiniteAutomaton FClone = f.getClone();
            reachable.add(FClone.getInitial());
            int iterator = 0;
            int n = 1;
            while(n > iterator){
                for(int cont=iterator; cont < n; cont++){
                    for(Character a : reachable.get(cont).transition.keySet()) {
                        ArrayList<State> list = reachable.get(cont).getListStates(a);
                        for(State s: list) {
                            if(!reachable.contains(s)){
                                reachable.add(s);
                                n++;
                            }
                        }
                    }
                iterator++;
                } 
            }
            
            return new FiniteAutomaton(new ArrayList<State>(reachable), FClone.alphabet, FClone.getInitial(), FClone.getName());
	}

/**
   * @return finite automaton without dead states
*/
	public FiniteAutomaton remove_dead(FiniteAutomaton f) {
            FiniteAutomaton FClone = f.getClone();
            Set<State> alive = new HashSet<>();
            for(State s : FClone.states) 
                if (s.getIsFinal())
                    alive.add(s);
            /*if(alive.isEmpty()) {
                return new 
            }*/
            boolean temp = true;
            while(temp) {
                int size_alive = alive.size();
                for(State s: FClone.states){
                    for(Character c: s.transition.keySet()){
                        ArrayList<State> list = s.getListStates(c);
                        for(State l: list) {
                            if(alive.contains(l)) {
                                alive.add(s);
                            }
                        }    
                    }
                }
                if(size_alive == alive.size()) {
                    temp = false;
                }
            }
            if(!alive.contains(FClone.initial)){
                State q0 = new State(FClone.initial.getName(), false);
                ArrayList<State> states = new ArrayList<>();
                states.add(q0);
                return new FiniteAutomaton(states, FClone.alphabet, q0, FClone.getName());
            }
            ArrayList<State> states = new ArrayList<>();
            ArrayList<Character> caracters = new ArrayList<>();
            for(State s : alive) {
                for(Character c:s.transition.keySet()){
                    ArrayList<State> list = s.getListStates(c);
                    for(State s1: list){
                        if(!alive.contains(s1)){
                            states.add(s);
                            caracters.add(c);
                        }
                    }
                }
            }
            for(int i=0; i < states.size(); i++) {
                states.get(i).transition.remove(caracters.get(i));
            }
            return new FiniteAutomaton(new ArrayList<State>(alive),FClone.alphabet, FClone.getInitial(),FClone.getName());

	}   
        
/**
   * @return finite automaton withot equivalent states
*/
	public FiniteAutomaton equivalent_state(FiniteAutomaton f) {
            FiniteAutomaton FClone = complete(f);
            ArrayList<ArrayList<State>> group = new ArrayList<>();
            ArrayList<State> accept = new ArrayList<>();
            ArrayList<State> reject = new ArrayList<>();
            ArrayList<ArrayList<State>> temp = new ArrayList<>();
            ArrayList<ArrayList<State>> classesEq = new ArrayList<>();
            group.add(accept);
            group.add(reject);
            for (State s : FClone.states){
                if (s.getIsFinal()){
                    accept.add(s);
                } else {
                    reject.add(s);
                }
            }
            
            for(ArrayList<State> a1: group){
                for(int i = 0; i < a1.size(); i++){
                    boolean tem = false;
                    //System.out.println(temp);
                    for(ArrayList<State> alist: temp){
                        if(alist.contains(a1.get(i))){
                            tem = true;
                        }
                    }
                    if(!tem) {
                        ArrayList<State> classeN = new ArrayList<State>();
                        classeN.add(a1.get(i));
                        temp.add(classeN);
                    }
                    for(int j = i+1; j < a1.size(); j++){
                        //System.out.println("Comparando o estado "+a1.get(i)+" com "+a1.get(j));
                        if(equivalent_state_aux(a1.get(i), a1.get(j), group, FClone.alphabet)){
                            for(ArrayList<State> a2: temp){
                                if(a2.contains(a1.get(i))){
                                    if(!a2.contains(a1.get(j))){
                                        a2.add(a1.get(j));
                                    }
                                }
                            }
                            //temp.get(i).add(j);
                        } else {
                            //System.out.println("Não são equivalentes"); 
                        }
                    }   
                }
                classesEq.addAll(temp);
                temp.clear();
            }
            ArrayList<State> states = new ArrayList<>();
            Map<ArrayList<State>,State> map = new HashMap<>();
            Map<State,ArrayList<State>> map2 = new HashMap<>();
            State newInitial = null;
            for(ArrayList<State> a: classesEq){
                State s = new State(a.toString(), false);
                if(a.get(0).isFinal){
                    s.setIsFinal(true);
                }
                if(a.contains(FClone.initial)){
                    newInitial = s;
                }
                map.put(a, s);
                map2.put(s, a);
                states.add(s);
            }
            for(State s: states){
                State old = map2.get(s).get(0);
                for(Character c: FClone.alphabet){
                    State olds = old.getListStates(c).get(0);
                    for(ArrayList<State> a: classesEq){
                        if(a.contains(olds)){
                            s.setTransitions(c, map.get(a));
                        }
                    }
                }
            }
            FiniteAutomaton resp = new FiniteAutomaton(states, FClone.alphabet, newInitial, FClone.getName()+" Minimized");
            return resp;
	}
        
        public boolean equivalent_state_aux(State a1, State a2, ArrayList<ArrayList<State>> grupo, ArrayList<Character> alf)  {
            boolean resp = true;
            for(Character c:alf){
                State map1 = a1.getListStates(c).get(0);
                State map2 = a2.getListStates(c).get(0);
                ArrayList<State> groupA = null;
                ArrayList<State> groupB = null;
                for(ArrayList<State> g: grupo){
                    if(g.contains(map1)){
                        groupA = g;
                    }
                    if(g.contains(map2)){
                        groupB = g;
                    }
                }
                if(groupA != groupB){
                    resp = false;
                }
            }
            return resp;
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
            FiniteAutomaton FClone;
            if(!isDeterministic(f)){
                FClone = determinize(f);
            } else {
                FClone = f.getClone();
            }
            Map<State,State> map = new HashMap<>();
            State newInitial = new State("R", false);
            ArrayList<State> states = new ArrayList<>();
            if(FClone.initial.isFinal){
                newInitial.setIsFinal(true);
            }
            states.add(newInitial);
            for(State s: FClone.states){
                if(s.equals(FClone.initial)) {
                    State s1 = new State(s.getName(),true);
                    map.put(s, s1);
                    states.add(s1);
                } else {
                    State s1 = new State(s.getName(),false);
                    map.put(s, s1);
                    states.add(s1);
                }  
            }
            for(State s: FClone.states){
                if(s.isFinal){
                    newInitial.setTransitions('&', map.get(s));
                }
            }
            for(State s: FClone.states){
                for(Character c: s.transition.keySet()) {
                    ArrayList<State> list = s.getListStates(c);
                    for(State s1: list){
                        map.get(s1).setTransitions(c, map.get(s));
                    }
                }
            }
            
            FiniteAutomaton reverse = new FiniteAutomaton(states, FClone.alphabet, newInitial, new StringBuilder(FClone.getName()).reverse().toString());
            FiniteAutomaton determinized = determinize(reverse);
            f.setReverse(determinized);
            return determinized;
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
	public Set<String> enumeration(FiniteAutomaton fa, int size) {
            FiniteAutomaton FClone = fa.getClone();
            if(!isDeterministic(FClone)) {
                FClone = determinize(FClone);
            }
            State actual = FClone.initial;
            Set<String> sentences = new HashSet<>();
            if(size == 0) {
                if(actual.isFinal){
                    sentences.add("&");
                    return sentences;
                } else {
                    return sentences;
                }
            }
            return enumeration_helper(actual, "", size);
	}
        
        private Set<String> enumeration_helper(State s, String old, int size){
            Set<String> sentences = new HashSet<>();
            if(old.length() == size) {
                if(s.isFinal) {
                    sentences.add(old);
                    return sentences;
                } else {
                    return null;
                }
            }
            for(Character c: s.transition.keySet()){
                Set<String> sent = enumeration_helper(s.getListStates(c).get(0), old+""+c, size);
                if(sent != null){
                    sentences.addAll(sent);
                }
            }
            return sentences;
        }
        
        
/**
 * * @return Finite Automaton without & transitions
 */
        public FiniteAutomaton removeEpsilonTrasitions(FiniteAutomaton f){
            if(!hasEpsilonTrasitions(f))
                return f;
            FiniteAutomaton FAClone = f.getClone();
            Map<State,Set<State>> map = new HashMap<>(); //FAClone STATE TO EQUIV FAClone STATES
            
            for(State s: FAClone.states) {
                Set<State> reachable = reachableByEpsilon(s);
                map.put(s, reachable);
                for(State s1: reachable) {
                    if(s1.isFinal) {
                        s.setIsFinal(true);
                    }
                }
            }

            for(State s: FAClone.states){
                if(s.transition.containsKey('&')) {
                    s.transition.remove('&');
                }
            }

            for(State s: FAClone.states) {
                for(Character c: FAClone.alphabet) {
                    Set<State> unione = new HashSet<>();
                    for(State se: map.get(s)) {
                        if(se.transition.containsKey(c)){
                            ArrayList<State> transit = se.getListStates(c);
                            Set<State> union = new HashSet<>();
                            for(State s1: transit) {
                                union.addAll(map.get(s1));
                            }
                            unione.addAll(union);
                        }
                    }
                    ArrayList<State> uniona = new ArrayList<State>(unione);
                    if(s.transition.containsKey(c)){
                        s.transition.replace(c, uniona);
                    } else if(!uniona.isEmpty()){
                        s.setTransitions(c, uniona);
                    }
                }
            }
            return FAClone;
        }
        
        public Set<State> reachableByEpsilon(State s){
            ArrayList<State> equiv_s = new ArrayList<>();
            equiv_s.add(s);

            int iterator = 0;
            int n = 1;
            while(n > iterator){
                if(equiv_s.get(iterator).transition.containsKey('&')) {
                    ArrayList<State> reachable = equiv_s.get(iterator).transition.get('&');
                    for(State st: reachable) {
                        if(!equiv_s.contains(st)) {
                            equiv_s.add(st);
                            n++;
                        }
                    }
                    }
                iterator++;
            }
            return new HashSet<State>(equiv_s);
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

