package regular_grammar;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RegularGrammar{

	protected String initialSymbol;
        Map<String, ArrayList<String>> productions;
/**
   * Constructor.
*/
        public RegularGrammar(){
            this.productions = new HashMap<>();
        }
       
	public RegularGrammar(String initialSymbol) {
            this.initialSymbol = initialSymbol;
            this.productions = new HashMap<>();
        }
    
        public String getInitialSymbol(){
            return initialSymbol;
        }
        
        public void setInitialSymbol(String initialSymbol){
            this.initialSymbol = initialSymbol;
        }
        
        public void setProductions(Map<String, ArrayList<String>> productions){
            for(String key :productions.keySet()){
                setProductions(key, productions.get(key));
            }
        }
        
        protected void setProductions (String c, ArrayList<String> list) {
            for(String s: list){
                setProductions(c, s);
            }
        }
        
        public Map<String, ArrayList<String>> getProductions() {
            return productions;
        }
        
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
        
        @Override
        public String toString(){
            String resp = "InitialSymbol:"+initialSymbol+"\nProductions:";
            //System.out.println(resp);
            for(String key : productions.keySet()){
                    resp += "("+key+","+productions.get(key)+")\n";  
            }
            return resp;
        }
        
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
