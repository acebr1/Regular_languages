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
                if(alphabet.contains(key+"")){
                    alphabet.remove(key);
                } else{
                    for (String key2 : GBClone.productions.keySet()){
                        ArrayList<String> list = GBClone.getProductions().get(key2);
                            for(String s : list){
                                if(s.length() > 1){
                                    if(alphabet.contains(key2) && s.charAt(1)+"" == key2){
                                        GBClone.setProductions(key2+"", s.charAt(0)+""+key2+"");
                                        alphabet.remove(key2);
                                    } else if(alphabet.contains(key2)){
                                        GBClone.setProductions(key2+"", s+"");
                                        alphabet.remove(key2);
                                    } else if(s.charAt(1)+"" == key2){
                                        GBClone.setProductions(key2+"", s.charAt(0)+""+key2+"");
                                    }
                                }
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
