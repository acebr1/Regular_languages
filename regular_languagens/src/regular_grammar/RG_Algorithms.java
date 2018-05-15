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
            RegularGrammar gnew = new RegularGrammar();
            //Map<String, ArrayList<String>> gaproductions = new HashMap<>();
            //Map<String, ArrayList<String>> gbproductions = new HashMap<>();
            String initialSymbol = "U";
            gnew.setInitialSymbol(initialSymbol);
            for (String key : gb.productions.keySet()) {
                key = key +"´";
                ArrayList<String> temp = gb.productions.get(key);
                for(String s : temp){
                    s = s.charAt(0) + s.charAt(1) + "´";
                    if (key.equals(gnew.getInitialSymbol()) && s.length() > 2) {
                        gnew.setProductions(initialSymbol, s.charAt(0) + initialSymbol);
                    } else {
                        gnew.setProductions(key, s);
                    }
                }
            }
            for (String key : ga.productions.keySet()) {
                ArrayList<String> temp = ga.productions.get(key);
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
            RegularGrammar gnew = new RegularGrammar();
            //Map<String, ArrayList<String>> gaproductions = new HashMap<>();
            //Map<String, ArrayList<String>> gbproductions = new HashMap<>();
            gnew.setInitialSymbol(ga.getInitialSymbol());
            gnew.setProductions(ga.getProductions());
            for (String key : gb.productions.keySet()) {
                key = key +"´";
                ArrayList<String> temp = gb.productions.get(key);
                for(String s : temp){
                    s = s.charAt(0) + s.charAt(1) + "´";
                    gnew.setProductions(key, s);
                }
            }
            for (String key : ga.productions.keySet()) {
                ArrayList<String> temp = ga.productions.get(key);
                for(String s : temp){
                    if (s.length() > 2 && !"&".equals(s)) {
                      gnew.setProductions(key, s.charAt(0) + gb.getInitialSymbol());
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
            RegularGrammar gnew = new RegularGrammar();
            //Map<String, ArrayList<String>> productions = new HashMap<>();
            gnew.setInitialSymbol(ga.getInitialSymbol());
            gnew.setProductions(ga.getProductions());
            for (String key : ga.productions.keySet() ) {
                ArrayList<String> temp = ga.productions.get(key);
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
