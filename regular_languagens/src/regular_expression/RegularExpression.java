//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

package regular_expression;

public class RegularExpression {

	public String regularExpression;
/**
   * Constructor que tem como parâmetro a expressão regular e um nome
*/
	public RegularExpression(String regularExpression) {
		this.regularExpression = regularExpression;
	}
        
        public void setExpression(String s){
            this.regularExpression = s;
        }
        
        public String getExpression(){
            return this.regularExpression;
        }
}
