/*
 * Tests to Transformation.java
 */
package tests;

import finite_automaton.FA_algorithms;
import finite_automaton.FiniteAutomaton;
import finite_automaton.State;
import transformation.Transformation;
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
     /**
     * Exercise 1 Slides
     */
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
              
        FiniteAutomaton automaton = new FiniteAutomaton(st, alphabet, init, "a"); 
        
        RegularGrammar grammar = new RegularGrammar();

        grammar.setInitialSymbol("S");
        
        grammar.setProductions("S", "aC");
        grammar.setProductions("S", "bB");
        grammar.setProductions("S", "cA");
        grammar.setProductions("S", "b");
        grammar.setProductions("S", "c");
        grammar.setProductions("S", "&");
        grammar.setProductions("A", "aC");
        grammar.setProductions("A", "bB");
        grammar.setProductions("A", "cA");
        grammar.setProductions("A", "b");
        grammar.setProductions("A", "c");
        grammar.setProductions("B", "aC");
        grammar.setProductions("B", "bC");
        grammar.setProductions("B", "cA");
        grammar.setProductions("B", "c");
        grammar.setProductions("C", "aA");
        grammar.setProductions("C", "bC");
        grammar.setProductions("C", "cC");
        grammar.setProductions("C", "a");
        
        Transformation t = new Transformation();
        System.out.println(automaton);
        System.out.println(grammar);
        System.out.println(t.AFtoRG(automaton));
        assertEquals(grammar.toString(), t.AFtoRG(automaton).toString());
    }

    /**
     * Test of RGtoAF method, of class Transformation.
     */
    @Test
    public void testRGtoAF() {
       RegularGrammar grammar = new RegularGrammar();

        grammar.setInitialSymbol("S");
        
        grammar.setProductions("S", "aC");
        grammar.setProductions("S", "bB");
        grammar.setProductions("S", "cA");
        grammar.setProductions("S", "b");
        grammar.setProductions("S", "c");
        grammar.setProductions("S", "&");
        grammar.setProductions("A", "aC");
        grammar.setProductions("A", "bB");
        grammar.setProductions("A", "cA");
        grammar.setProductions("A", "b");
        grammar.setProductions("A", "c");
        grammar.setProductions("B", "aC");
        grammar.setProductions("B", "bC");
        grammar.setProductions("B", "cA");
        grammar.setProductions("B", "c");
        grammar.setProductions("C", "aA");
        grammar.setProductions("C", "bC");
        grammar.setProductions("C", "cC");
        grammar.setProductions("C", "a");
        
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
              
        FiniteAutomaton automaton = new FiniteAutomaton(st, alphabet, init, "a"); 
       
        Transformation t = new Transformation();
        
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(automaton, f.determinize(t.RGtoAF(grammar)));

    }
    
}
