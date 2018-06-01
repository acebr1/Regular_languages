//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package finite_automaton;
import java.util.ArrayList;

public class FiniteAutomaton{

        FiniteAutomaton deterministic;
        FiniteAutomaton minimized;
        FiniteAutomaton complement;
        FiniteAutomaton reverse;
        FiniteAutomaton complete;
        FiniteAutomaton noEpsilon;
        
	public ArrayList<State> states;
	protected ArrayList<Character> alphabet;
	State initial;
	public String name = "";

/**
   * Constructor sem parâmetros
*/
        public FiniteAutomaton() {}
        
/**
   * Constructor com parâmetros
*/
	public FiniteAutomaton(ArrayList<State> states, ArrayList<Character> alphabet, State initial, String name) {
		this.states = states;
		this.alphabet = alphabet;
		this.initial = initial;
                this.name = name;
	}

/**
   * Pegar o estado inicial do autômato finito
*/        
        public State getInitial() {
            return initial;
        }

/**
   * Atribuir o automato finito deterministico a variável
*/        
        public void setDeterministic (FiniteAutomaton f) {
            this.deterministic = f;
        }
 
/**
   * Atribuir o automato finito mínimo a variável
*/ 
        public void setMinimized (FiniteAutomaton f) {
            this.minimized = f;
        }

/**
   * Atribuir o complemento do automato finito a variável
*/         
        public void setComplement (FiniteAutomaton f) {
            this.complement = f;
        }

/**
   * Atribuir o automato finito reverso a variável
*/       
        public void setReverse (FiniteAutomaton f) {
            this.reverse = f;
        }
 
/**
   * Atribuir o automato finito completo a variável
*/
        public void setComplete (FiniteAutomaton f) {
            this.complete = f;
        }
 
/**
   * Atribuir o automato finito sem epsilon transições a variável
*/
        public void setNoEpsilon (FiniteAutomaton f) {
            this.noEpsilon = f;
        }
        
/**
   * Pegar o automato finito completo
*/
        public FiniteAutomaton getComplete() {
            return this.complete;
        }

/**
   * Pegar o automato finito sem epsilon transições
*/        
        public FiniteAutomaton getNoEpsilon() {
            return this.noEpsilon;
        }
  
/**
   * Pegar o automato finito deterministico
*/
        public FiniteAutomaton getDeterministic() {
            return this.deterministic;
        }
 
/**
   * Pegar o automato finito reverso 
*/
        public FiniteAutomaton getReverse() {
            return this.reverse;
        }
 
/**
   * Pegar os estados do automato finito x
*/
        public ArrayList<State> getStates(){
            return this.states;
        }

/**
   * Visualizar o autômato finito
*/        
        @Override
        public String toString(){
            String resp = "Name:"+name+"\nStates:"+states+"\nTransitions:\n";
            //System.out.println(resp);
            for(State s : states) {
                for(Character key : s.transition.keySet()){
                    if(initial.equals(s)) resp += "->";
                    if(s.isFinal) resp += "*";
                    resp += s+"("+key+","+s.transition.get(key)+")\n";
                }  
            }
            return resp;
        }

/**
   * Pegar o nome do automato finito x
*/        
        public String getName(){
            return this.name;
        }
 
/**
   * Fazer uma cópia do automato finito
*/ 
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
