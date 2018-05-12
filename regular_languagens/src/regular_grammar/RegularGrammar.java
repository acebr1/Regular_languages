package regular_grammar;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RegularGrammar{

	protected char initialSymbol;
        Map<Character, ArrayList<String>> productions;

/**
   * Constructor.
*/
        public RegularGrammar(){}
        
	public RegularGrammar(char initialSymbol, ArrayList<String> productions) {
            this.initialSymbol = initialSymbol;
            this.productions = new HashMap<>();
	}
        
        protected void setProductions (char c, ArrayList<String> list) {
            productions.put(c, list);
        }
        
        public void setProductions (char c, String prod) {
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
