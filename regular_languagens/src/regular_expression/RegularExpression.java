package regular_expression;

import finite_automaton.FiniteAutomaton;
import finite_automaton.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RegularExpression {

	protected String regularExpression;
        public String name;
/**
   * Constructor.
*/
	public RegularExpression(String regularExpression, String name) {
		this.regularExpression = regularExpression;
                this.name = name;
	}
}
