/*
 * Tests to Transformation.java
 */
package tests;

import finite_automaton.FiniteAutomaton;
import finite_automaton.State;
//import transformation.Transformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import regular_expression.RegularExpression;
import regular_grammar.RegularGrammar;

public class TransformationTest {
    
    public TransformationTest() {
        
    }

    /**
     * Test of AFtoRG method, of class Transformation.
     */
    @Test
    public void testAFtoRG() {
        State q0 = new State("q0", true);
        State q1 = new State("q1", true);
        State q2 = new State("q2", false);
        
        State init = q0;
        
        ArrayList<State> st = new ArrayList<>();
        st.add(q0);
        st.add(q1);
        st.add(q2);
        
        q0.setTransitions('a', q2);
        q0.setTransitions('b', q1);
        q0.setTransitions('c', q0);
        q1.setTransitions('a', q2);
        q1.setTransitions('b', q2);
        q1.setTransitions('c', q0);
        q2.setTransitions('a', q0);
        q2.setTransitions('b', q2);
        q2.setTransitions('c', q2);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
              
        FiniteAutomaton automaton = new FiniteAutomaton(st, alphabet, init); 
       
        //Transformation t = new Transformation();
        
        //char initialG = 'S';
        //Character S = new Character();        
        //ArrayList<String> prod = new ArrayList<>();
        //prod.setProductions('S', "aB");
        
        //RegularGrammar grammar = new RegularGrammar(initialG, prod);
        
        //assertEquals(grammar, t.AFtoGR(automaton));
    }

    /**
     * Test of RGtoAF method, of class Transformation.
     */
    @Test
    public void testRGtoAF() {
       
    }

    /**
     * Test of DeSimone method, of class Transformation.
     */
    @Test
    public void testDeSimone() {
        
    }
    
}
