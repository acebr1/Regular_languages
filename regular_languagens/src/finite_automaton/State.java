//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package finite_automaton;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class State {

	protected String name;
	protected boolean isFinal;
        public Map<Character, ArrayList<State>> transition; 
        // a partir de um estado , ao ler um caracter chega a outros estados
        
/**
   * Construtor.
*/
	public State(String name, boolean isFinal) {
                this.transition = new HashMap<>();
		this.name = name;
                this.isFinal = isFinal;
        }
        
/**
   * Recebe um caracter e uma lista de estados e adiciona as transições do estado x
*/       
        public void setTransitions (char c, ArrayList<State> list) {
            transition.put(c,list);
        }

/**
   * Recebe um caracter e um estado e adiciona a transição ao estado x
*/           
        public void setTransitions (char c, State s) {
            if(transition.containsKey(c)) {
                ArrayList<State> list = transition.get(c);
                list.add(s);
                transition.put(c, list);
            } else {
                ArrayList<State> list = new ArrayList<State>();
                list.add(s);
                setTransitions(c, list);
            }
        }
        
/**
   * Recebe um caracter e retorna uma lista de estados, 
   * que o estado x alcança através do caracter c
*/
        public ArrayList<State> getListStates(char c) {
            return transition.get(c);
        }
        
/**
   * Pega o nome do estado
*/ 
	public String getName() {
            return name;
	}

/**
   * Modifica o nome do estado
*/ 
	public void setName(String name) {
            this.name = name;
	}

/**
   * Pega o valor da variável isFinal
*/ 
	public boolean getIsFinal() {
            return isFinal;
	}

/**
   * Modifica o valor da variável isFinal
*/ 
	public void setIsFinal(boolean isFinal) {
            this.isFinal = isFinal;
	}
 
/**
   * Pega o valor de todas as transições do estado x
*/ 
        public Map<Character, ArrayList<State>> getTransitions(){
            return this.transition;
        }
 
/**
   * Retorna o nome do estado
*/ 
        @Override
        public String toString() {
            return ""+name;
        }
       
}
