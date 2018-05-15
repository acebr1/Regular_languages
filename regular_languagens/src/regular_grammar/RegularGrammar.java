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
        public RegularGrammar(){}
        
	public RegularGrammar(String initialSymbol, ArrayList<String> productions) {
            this.initialSymbol = initialSymbol;
            this.productions = new HashMap<>();
	}
        
        public String getInitialSymbol(){
            return initialSymbol;
        }
        
        public void setInitialSymbol(String initialSymbol){
            this.initialSymbol = initialSymbol;
        }
        
        public Map<String, ArrayList<String>> getProductions() {
            return productions;
        }
        
        protected void setProductions (String c, ArrayList<String> list) {
            productions.put(c, list);
        }
        
        public void setProductions (String c, String prod) {
            if(productions.containsKey(c)) {
                ArrayList<String> list = productions.get(c);
                list.add(prod);
                productions.put(c, list);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(prod);
                setProductions(c, list);
            }
        }
}
