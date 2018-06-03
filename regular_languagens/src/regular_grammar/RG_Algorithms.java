//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package regular_grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RG_Algorithms{

/**
   * Construtor sem parâmetros.
*/
	public RG_Algorithms() {}
        

/**
   * Renomear os símbolos não-terminais da gramática gb,
   * para que os símbolos de ga e gb sejam diferentes
*/        
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
            Map<String, String> aux = new HashMap<>();
            for(String key : GBClone.getProductions().keySet()){
                if(alphabet.contains(key)){
                    alphabet.remove(key);
                    gnew.setProductions(key+"", GBClone.getProductions().get(key)+"");
                } else{
                    aux.put(key, alphabet.get(0));
                    alphabet.remove(0);
                }
            }
            for(String key : GBClone.getProductions().keySet()){
                ArrayList<String> list = GBClone.getProductions().get(key);
                    for(String s : list){
                        if(aux.containsKey(key)){
                            if(s.length() == 1){
                                gnew.setProductions(aux.get(key), s);
                                gnew.setInitialSymbol(aux.get(key));
                            } else{
                                String temp = s.charAt(1)+"";
                                if(aux.containsKey(temp)){
                                    gnew.setProductions(aux.get(key), s.charAt(0)+""+aux.get(temp));
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
            gnew.setName(GAClone.getName()+"U"+GBClone.getName());
            String initialSymbol = "U";
            gnew.setInitialSymbol(initialSymbol);
            RegularGrammar gtemp = renameGrammar(GAClone, GBClone);
            for (String key : gtemp.productions.keySet()) {
                ArrayList<String> temp = gtemp.productions.get(key);
                for(String s : temp){
                    if (key.equals(gtemp.getInitialSymbol())) {
                        gnew.setProductions(initialSymbol+"", s+"");
                    }
                    if(!s.equals("&")){    
                        gnew.setProductions(key+"", s+""); 
                    }
                }
            }
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if (key.equals(GAClone.getInitialSymbol())) {
                        gnew.setProductions(initialSymbol+"", s+"" );
                    }
                    if(!s.equals("&")){    
                        gnew.setProductions(key+"", s+""); 
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
            gnew.setName(GAClone.getName()+""+GBClone.getName());
            gnew.setInitialSymbol(GAClone.getInitialSymbol());
            RegularGrammar gtemp = renameGrammar(GAClone, GBClone);
            boolean flag = false;
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if(s.equals("&")){
                        flag = true;
                    } else{
                        break;
                    }
                }
            }
            boolean flag2 = false;
            for (String key : gtemp.productions.keySet()) {
                ArrayList<String> temp = gtemp.productions.get(key);
                for(String s : temp){
                    if(s.equals("&")){
                        flag2 = true;
                    } else{
                        break;
                    }
                }
            }    
            for (String key : GAClone.productions.keySet()) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    if(!s.equals("&")){
                        if(key.equals(gnew.getInitialSymbol())){
                            if(s.length() == 2)
                                gnew.setProductions(gnew.getInitialSymbol()+"", s);
                            if(s.length() == 1 && flag && flag2) {
                                gnew.setProductions(gnew.getInitialSymbol()+"", s+""+gtemp.getInitialSymbol()+"");
                                gnew.setProductions(gnew.getInitialSymbol()+"", s+"");
                            }
                            if(s.length() == 1 && !flag && flag2) {
                                gnew.setProductions(gnew.getInitialSymbol()+"", s+""+gtemp.getInitialSymbol()+"");
                                gnew.setProductions(gnew.getInitialSymbol()+"", s+"");
                            }
                            if(s.length() == 1 && flag && !flag2) 
                                gnew.setProductions(gnew.getInitialSymbol()+"", s+""+gtemp.getInitialSymbol()+"");
                            if(s.length() == 1 && !flag && !flag2) 
                                gnew.setProductions(gnew.getInitialSymbol()+"", s+""+gtemp.getInitialSymbol()+"");
                        } else{
                            if(s.length() == 2)
                                gnew.setProductions(key+"", s);
                            if(s.length() == 1 && flag && flag2) {
                                gnew.setProductions(key+"", s+""+gtemp.getInitialSymbol()+"");
                                gnew.setProductions(key+"", s+"");
                            }
                            if(s.length() == 1 && !flag && flag2) {
                                gnew.setProductions(key+"", s+""+gtemp.getInitialSymbol()+"");
                                gnew.setProductions(key+"", s+"");
                            }
                            if(s.length() == 1 && flag && !flag2) 
                                gnew.setProductions(key+"", s+""+gtemp.getInitialSymbol()+"");
                            if(s.length() == 1 && !flag && !flag2) 
                                gnew.setProductions(key+"", s+""+gtemp.getInitialSymbol()+"");
                        } 
                    }
                }    
            }
            if(flag && flag2){
                gnew.setProductions(gnew.getInitialSymbol()+"", "&");
            }
            for (String key : gtemp.productions.keySet()) {
                ArrayList<String> temp = gtemp.productions.get(key);
                for(String s : temp){
                    if(!s.equals("&")){
                        gnew.setProductions(key+"", s);
                        if(key.equals(gtemp.getInitialSymbol()) && flag && flag2)
                            gnew.setProductions(gnew.getInitialSymbol()+"", s);
                        if(key.equals(gtemp.getInitialSymbol()) && flag && !flag2)
                            gnew.setProductions(gnew.getInitialSymbol()+"", s);
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
            gnew.setName("("+GAClone.getName()+")*");
            String initialSymbol = "Z";
            gnew.setInitialSymbol(initialSymbol);
            gnew.setProductions(GAClone.getProductions());
            for (String key : GAClone.productions.keySet() ) {
                ArrayList<String> temp = GAClone.productions.get(key);
                for(String s : temp){
                    gnew.setProductions(key, s);
                    if (key.equals(GAClone.getInitialSymbol())) {
                        gnew.setProductions(initialSymbol+"", s+"");
                    }
                    if (s.length() < 2 && !"&".equals(s)){
                      gnew.setProductions(key, s.charAt(0) + GAClone.getInitialSymbol());  
                    }
                    gnew.setProductions(initialSymbol, "&");
                }
            }
            return gnew;
	}
        
}
