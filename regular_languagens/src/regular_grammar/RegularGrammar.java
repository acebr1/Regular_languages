//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package regular_grammar;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RegularGrammar{

	protected String initialSymbol;
        Map<String, ArrayList<String>> productions;
        public String name ="";
        
/**
   * Constructor sem parâmetros, apenas inicialização das produções de uma gramática
*/
        public RegularGrammar(){
            this.productions = new HashMap<>();
        }
        
/**
   * Constructor com único parâmetro e inicialização das produções de uma gramática
*/      
	public RegularGrammar(String initialSymbol) {
            this.initialSymbol = initialSymbol;
            this.productions = new HashMap<>();
        }
        
/**
   * Constructor com parâmetros e inicialização das produções de uma gramática
*/
        public RegularGrammar(String initialSymbol,String name) {
            this.initialSymbol = initialSymbol;
            this.name = name;
            this.productions = new HashMap<>();
        }
   
/**
   * Pegar nome da gramática
*/        
        public String getName(){
            return this.name;
        }
  
/**
   * Modificar nome da gramática
*/
        public void setName(String name){
            this.name = name;
        }
        
/**
   * Pegar símbolo inicial da gramática
*/
        public String getInitialSymbol(){
            return initialSymbol;
        }
        
/**
   * Modificar símbolo inicial da gramática
*/
        public void setInitialSymbol(String initialSymbol){
            this.initialSymbol = initialSymbol;
        }
        
/**
   * Recebe um mapa de produções e adiciona essas produção à gramática
*/       
        public void setProductions(Map<String, ArrayList<String>> productions){
            for(String key :productions.keySet()){
                setProductions(key, productions.get(key));
            }
        }
 
/**
   * Recebe um símbolo não-terminal e suas produções, e adiciona à gramática
*/ 
        protected void setProductions (String c, ArrayList<String> list) {
            for(String s: list){
                setProductions(c, s);
            }
        }

/**
   * Pega as produções da gramática
*/         
        public Map<String, ArrayList<String>> getProductions() {
            return productions;
        }
 
/**
   * Recebe um símbolo não-terminal e uma produção, e adiciona à gramática
*/ 
         public void setProductions (String c, String prod) {
            if(productions.containsKey(c)) {
                ArrayList<String> list = productions.get(c);
                if(!list.contains(prod)){
                    list.add(prod);
                    productions.put(c, list);
                }
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(prod);
                productions.put(c, list);
            }
        }
 
/**
   * Visualizar a gramática regular
*/ 
        @Override
        public String toString(){
            String resp = "InitialSymbol:"+initialSymbol+"\nProductions:";
            //System.out.println(resp);
            resp += initialSymbol+"->"+productions.get(initialSymbol)+"\n";          
            for(String key : productions.keySet()){
                if(!key.equals(initialSymbol))
                    resp += key+"->"+productions.get(key)+"\n";  
            }
            return resp;
        }

/**
   * Fazer uma cópia da gramática regular
*/
        public RegularGrammar getClone(){
            RegularGrammar gClone = new RegularGrammar(this.getInitialSymbol()+"");
            for(String key : this.productions.keySet()) {
                ArrayList<String> list = this.productions.get(key);
                for(String s : list){
                    gClone.setProductions(key+"", s+"");
                }
            }
            return gClone;
        }
}
