package regular_grammar;

import java.util.ArrayList;
import java.util.Map;

public class RG_Algorithms{

/**
   * Constructor.
*/
	RG_Algorithms() {}

/**
   * @return Regular grammar resulting from the union
*/
	public RegularGrammar union(RegularGrammar ga, RegularGrammar gb) {
            Map<String, ArrayList<String>> gaproductions = ga.getProductions();
            Map<String, ArrayList<String>> gbproductions = gb.getProductions();
            RegularGrammar gnew = new RegularGrammar();
            String initialSymbol = "U";
            gnew.setInitialSymbol(initialSymbol);
            
            for((String a) : gbproductions) {
                a = a + "'";
            }
            for ((String s) : gbproductions) {
                s = s.charAt(0) + s.charAt(1) + "'";
            }
            for((String a) : gaproductions) {
                for ((String s) :gaproductions) {
                    if (a.equals(gaproductions.getInitialSymbol())) {
                      gnew.setProductions(initialSymbol, s);
                    } else {
                        gnew.setProductions(a, s);
                    }
                }
            }
            for((String a) : gbproductions) {
                for ((String s) :gbproductions) {
                    if (a.equals(gbproductions.getInitialSymbol())) {
                      gnew.setProductions(initialSymbol, s);
                    } else {
                        gnew.setProductions(a, s);
                    }
                }
            }

            return gnew;
 
	}

/**
   * @return Regular grammar resulting from the concatenation
*/
	public RegularGrammar concatenation(RegularGrammar ga, RegularGrammar gb) {
            Map<String, ArrayList<String>> gaproductions = ga.getProductions();
            Map<String, ArrayList<String>> gbproductions = gb.getProductions();
            RegularGrammar gnew = new RegularGrammar();
            gnew.initialSymbol = ga.getInitialSymbol();            
            
            for((String a) : gbproductions) {
                a = a + "'";
            }
            for ((String s) : gbProductions) {
                s = s.charAt(0) + s.charAt(1) + "'";
            }
            for (String a : gaproductions) {
                for (String s : gaproductions) {
                    if (s.charAt(2).equals(null)) {
                      gnew.setProductions(a, s.charAt(0), gbproductions.getInitialSymbol());
                    } else {
                      gnew.setProductions(a, s);
                    }
                }
            }
            for (String a : gbproductions) {
                for (String s : gbproductions) {
                      gnew.setProductions(a, s);
                }
            }
            return gnew;
	}

/**
   * @return Regular grammar resulting from the closure
*/
	public RegularGrammar closure(RegularGrammar ga) {
            Map<String, ArrayList<String>> productions = ga.getProductions();
            RegularGrammar gnew = new RegularGrammar();
            gnew.initialSymbol = ga.getInitialSymbol();
            for ((String a) : productions) {
                for ((String s) : productions) {
                    gnew.setProductions(a, s);
                    if (s.charAt(1).equals(null)){
                        gnew.setProductions(a, s.charAt(1) + ga.getInitialSymbol());
                    }    
                }
            }
            return gnew;
	}

}
