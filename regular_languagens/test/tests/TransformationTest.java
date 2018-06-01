//  Copyright 2018 <Fabíola Maria Kretzer> <Maurício Machado Barbosa>

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
import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import regular_expression.RegularExpression;
import regular_grammar.RegularGrammar;

public class TransformationTest {
    
    public TransformationTest() {}

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
        //System.out.println(automaton);
        //System.out.println(grammar);
        RegularGrammar rg = t.AFtoRG(automaton);
        for(String s:grammar.getProductions().keySet()){
            ArrayList<String> list = grammar.getProductions().get(s);
            for(String l: list){
                assertEquals(true, rg.getProductions().get(s+"").contains(l));
            }
        }
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
        
        FiniteAutomaton fa = f.minimize(t.RGtoAF(grammar));
        Set<String> sentences = f.enumeration(automaton, 10);
        for(String s: sentences){
            assertEquals(true, f.recognize(fa, s));
        }
    }
    
/**
 * Test of deSimone method, of class Transformation.
*/   
    @Test
    public void testDeSimone() {
        State q0 = new State("q0", true);
        State q1 = new State("q1", true);
        State q2 = new State("q2", true);
        
        State initialA = q0;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        statesA.add(q2);
        
        q0.setTransitions('0', q1);
        q0.setTransitions('1', q2);
        q1.setTransitions('1', q2);
        q2.setTransitions('0', q1);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('0');
        alphabet.add('1');
    
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A");  
        RegularExpression a12 = new RegularExpression("1?(01)*0?", "12a");
        Transformation t = new Transformation();
        FA_algorithms f = new FA_algorithms();
        FiniteAutomaton REAFD = t.DeSimone(a12);
        
        FiniteAutomaton automatonC = f.complement(automaton);
        Set<String> sentencesA = f.enumeration(automaton, 10);
        Set<String> sentencesR = f.enumeration(automatonC, 10);
        for(String s: sentencesA){
            assertEquals(true, f.recognize(REAFD, s));
        }
        for(String s: sentencesR){
            assertEquals(false, f.recognize(REAFD, s));
        }
        
        RegularExpression b12 = new RegularExpression("1?1?(00?11?)*0?0?", "12b");
        FiniteAutomaton afb12 = t.DeSimone(b12);
        
        q0 = new State("q0", true);
        q1 = new State("q1", true);
        q2 = new State("q2", true);
        State q3 = new State("q3", true);
        State q6 = new State("q6", true);
        
        initialA = q0;
        
        statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        statesA.add(q2);
        statesA.add(q3);
        statesA.add(q6);
        
        q0.setTransitions('0', q1);
        q0.setTransitions('1', q2);
        q1.setTransitions('0', q3);
        q1.setTransitions('1', q2);
        q2.setTransitions('0', q1);
        q2.setTransitions('1', q6);
        q3.setTransitions('1', q2);
        q6.setTransitions('0', q1);
        
        alphabet = new ArrayList<>();
        alphabet.add('0');
        alphabet.add('1');
        automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
        automatonC = f.complement(automaton);
        Set<String> sentencesC = f.enumeration(automaton, 10);
        sentencesR = f.enumeration(automatonC, 10);
        for(String s: sentencesC){
            assertEquals(true, f.recognize(afb12, s));
        }
        for(String s: sentencesR){
            assertEquals(false, f.recognize(afb12, s));
        }
        
        RegularExpression erro = new RegularExpression("a***", "erro");
        assertEquals(true, f.recognize(t.DeSimone(erro), "aaaaaaaaaaaaaaaaa"));
    }
    
}
