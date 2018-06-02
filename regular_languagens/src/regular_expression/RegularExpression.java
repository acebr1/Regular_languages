//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package regular_expression;

public class RegularExpression {

	protected String regularExpression;
        public String name;
/**
   * Constructor que tem como parâmetro a expressão regular e um nome
*/
	public RegularExpression(String regularExpression, String name) {
		this.regularExpression = regularExpression;
                this.name = name;
	}
        
        public void setExpression(String s){
            this.regularExpression = s;
        }
        
        public String getExpression(){
            return this.regularExpression;
        }
}
