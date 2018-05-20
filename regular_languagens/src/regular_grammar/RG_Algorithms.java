package regular_grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RG_Algorithms{

/**
   * Constructor.
*/
	public RG_Algorithms() {}
        
        public RegularGrammar renameGrammar(RegularGrammar ga, RegularGrammar gb){
            RegularGrammar GAClone = ga.getClone();
            RegularGrammar GBClone = gb.getClone();
            RegularGrammar gnew = new RegularGrammar();
            ArrayList<String> alphabet = new ArrayList<>();
            char a = 'A';
            while(a != 'Z'){
                alphabet.add(a +"");
                a++;
            }
            for(String key : GAClone.getProductions().keySet()){
                alphabet.remove(key);
            }
            if(alphabet.contains(GBClone.getInitialSymbol())){
                gnew.setInitialSymbol(GBClone.getInitialSymbol());
            } else {
                gnew.setInitialSymbol(alphabet.get(0));
            }
            for (String key : GBClone.getProductions().keySet()){
                if(alphabet.contains(key)){
                    alphabet.remove(key);
                    gnew.setProductions(key, GBClone.getProductions().get(key));
                } else{
                    String aux = alphabet.get(0)+"";
                    alphabet.remove(aux);
                    for (String key2 : GBClone.productions.keySet()){
                        ArrayList<String> list = GBClone.getProductions().get(key2);
                        for(String s : list){
                             GBClone.setProductions(aux+"", s.charAt(0)+"");
                        }
                    }
                }
            }
            return gnew;
        }

/**
   * @return Regular grammar resulting from the union
*/
	public RegularGrammar union(RegularGrammar ga, RegularGrammar gb) {
            RegularGrammar GAClone = ga.getClone();
            RegularGrammar GBClone = gb.getClone();
            RegularGrammar gnew = new RegularGrammar();
            String initialSymbol = "U";
            gnew.setInitialSymbol(initialSymbol);
            //RegularGrammar gtemp = renameGrammar(GAClone, GBClone);
            for (String key : GBClone.productions.keySet()) {
                ArrayList<String> temp = GBClone.productions.get(key);
                for(String s : temp){
                    if (key.equals(GBClone.getInitialSymbol())) {
                        gnew.setProductions(initialSymbol+"", s+"");
                    }
                    gnew.setProductions(key+"", s+"");
                }
            }
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if (key.equals(GAClone.getInitialSymbol())) {
                        gnew.setProductions(initialSymbol+"", s+"" );
                    }
                    gnew.setProductions(key+"", s+"");
                }
            }
            return gnew;
	}

/**
   * @return Regular grammar resulting from the concatenation
*/
	public RegularGrammar concatenation(RegularGrammar ga, RegularGrammar gb) {
            RegularGrammar GAClone = ga.getClone();
            RegularGrammar GBClone = gb.getClone();
            RegularGrammar gnew = new RegularGrammar();
            gnew.setInitialSymbol(GAClone.getInitialSymbol());
            //RegularGrammar gtemp = renameGrammar(GAClone, GBClone);
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if (s.length() == 1 && !"&".equals(s)) {
                      gnew.setProductions(key+"", s.charAt(0)+"" + GBClone.getInitialSymbol()+"");
                      gnew.setProductions(key+"", s+"");
                    } else {
                      gnew.setProductions(key, s);
                    }
                }
            }
            for (String key : GBClone.productions.keySet()) {
                ArrayList<String> temp = GBClone.productions.get(key);
                for(String s : temp){
                    if (!"&".equals(s)) {
                      gnew.setProductions(key+"", s+"");
                    } 
                }
            }
            
            return gnew;
	}

/**
   * @return Regular grammar resulting from the closure
*/
	public RegularGrammar closure(RegularGrammar ga) {
            RegularGrammar GAClone = ga.getClone();
            RegularGrammar gnew = new RegularGrammar();
            gnew.setInitialSymbol(GAClone.getInitialSymbol());
            gnew.setProductions(GAClone.getProductions());
            for (String key : GAClone.productions.keySet() ) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    gnew.setProductions(key, s);
                    if (s.length() < 2 && !"&".equals(s)){
                      gnew.setProductions(key, s.charAt(0) + gnew.getInitialSymbol());  
                    }
                }
            }
            return gnew;
	}
}
