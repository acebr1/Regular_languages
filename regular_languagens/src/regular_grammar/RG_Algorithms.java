package regular_grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RG_Algorithms{

/**
   * Constructor.
*/
	public RG_Algorithms() {}

/**
   * @return Regular grammar resulting from the union
*/
	public RegularGrammar union(RegularGrammar ga, RegularGrammar gb) {
            RegularGrammar GAClone = ga.getClone();
            RegularGrammar GBClone = gb.getClone();
            RegularGrammar gnew = new RegularGrammar();
            String initialSymbol = "U";
            gnew.setInitialSymbol(initialSymbol);
            gnew.setProductions(GAClone.getProductions());
            gnew.setProductions(GBClone.getProductions());
            for (String key : GAClone.productions.keySet()) {
                key = key +"´";
                ArrayList<String> temp = GBClone.productions.get(key);
                for(String s : temp){
                    s = s.charAt(0) + s.charAt(1) + "´";
                    if (key.equals(gnew.getInitialSymbol()) && s.length() > 2) {
                        gnew.setProductions(initialSymbol, s.charAt(0) + initialSymbol);
                    } else {
                        gnew.setProductions(key, s);
                    }
                }
            }
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if (key.equals(gnew.getInitialSymbol()) && s.length() > 2) {
                        gnew.setProductions(initialSymbol, s.charAt(0) + initialSymbol);
                    } else {
                        gnew.setProductions(key, s);
                    }
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
            gnew.setProductions(GAClone.getProductions());
            for (String key : GBClone.productions.keySet()) {
                key = key +"´";
                ArrayList<String> temp = GBClone.productions.get(key);
                for(String s : temp){
                    s = s.charAt(0) + s.charAt(1) + "´";
                    gnew.setProductions(key, s);
                }
            }
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if (s.length() > 2 && !"&".equals(s)) {
                      gnew.setProductions(key, s.charAt(0) + GBClone.getInitialSymbol());
                    } else {
                      gnew.setProductions(key, s);
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
