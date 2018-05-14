/*
 * Tests to FA_algorithms.java
 */
package tests;

import finite_automaton.FA_algorithms;
import finite_automaton.FiniteAutomaton;
import finite_automaton.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FA_algorithmsTest {
    
    public FA_algorithmsTest() {
    }
    
    /**
     * Test of isDeterministic method, of class FA_algorithms.
     */
    @Test
    public void testIsDeterministic() {
        /**
        * Language not exist (00) and not exist (11)
        */
        
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
    
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA );   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(true, f.isDeterministic(automaton)); 
    }
    
    /**
     * Test of isDeterministic method, of class FA_algorithms.
     */
  @Test
    public void testIsDeterministic2() {
        /**
        * Language Question 2 - list 0.4
        */
        
        State S = new State("S", true);
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", false);
        State D = new State("D", false);
        State F = new State("F", true);
        
        State initialA = S;
       
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(S);
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(D);
        statesA.add(F);
        
        S.setTransitions('0', A);
        S.setTransitions('0', D);
        S.setTransitions('1', F);
        A.setTransitions('0', A);
        A.setTransitions('0', B);
        A.setTransitions('1', C);
        A.setTransitions('1', F);
        B.setTransitions('0', B);
        C.setTransitions('0', A);
        C.setTransitions('0', B);
        D.setTransitions('0', B);
        D.setTransitions('0', D);
        D.setTransitions('1', C);
        D.setTransitions('0', B);
        F.setTransitions('0', F);
        F.setTransitions('1', F);

        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('0');
        alphabet.add('1');

        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA);   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(false, f.isDeterministic(automaton)); 
        f.determinize(automaton);
        assertEquals(false, f.isDeterministic(automaton)); 
        assertEquals(true, f.isDeterministic(f.determinize(automaton))); 
        assertEquals(true, f.isDeterministic(automaton.getDeterministic())); 
       
    }
    /**
     * Test of isComplete method, of class FA_algorithms.
     */
    @Test
    public void testIsComplete() {
        /**
        * Language not exist (00) and not exist (11)
        */
        
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
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA ); 
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(false, f.isComplete(automaton));
        assertEquals(true, f.isComplete(f.complete(automaton)));
        assertEquals(true, f.isComplete(automaton.getComplete()));
        assertEquals(false, f.isComplete(automaton));
    }
    
    /**
     * Test of isComplete method, of class FA_algorithms.
     */
    @Test
    public void testIsComplete2() {
        /**
        * Language |x| is odd
        */
        
        State q0 = new State("q0", false);
        State q1 = new State("q1", true);
        
        State initialA = q0;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        
        q0.setTransitions('a', q1);
        q0.setTransitions('b', q1);
        q1.setTransitions('a', q0);
        q1.setTransitions('b', q0);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA );   
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(true, f.isComplete(automaton));
    }
    /**
     * Test of determinize method, of class FA_algorithms.
     */
    @Test
    public void testDeterminize() {
        /**
        * Exercise 1 - Slides
        */
        State S = new State("S", true);
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", false);
        State F = new State("F", true);
        
        State initialA = S;
      
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(S);
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(F);
        
        S.setTransitions('a', A);
        S.setTransitions('b', B);
        S.setTransitions('b', F);
        S.setTransitions('c', S);
        S.setTransitions('c', F);
        A.setTransitions('a', S);
        A.setTransitions('a', F);
        A.setTransitions('b', C);
        A.setTransitions('c', A);
        B.setTransitions('a', A);
        B.setTransitions('c', B);
        B.setTransitions('c', S);
        B.setTransitions('c', F);
        C.setTransitions('a', S);
        C.setTransitions('a', F);
        C.setTransitions('c', A);
        C.setTransitions('c', C);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
              
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA ); 
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(false, f.isDeterministic(automaton));
	f.determinize(automaton);
        assertEquals(false, f.isDeterministic(automaton));
        assertEquals(true, f.isDeterministic(automaton.getDeterministic()));
        assertEquals(true, f.isDeterministic(f.determinize(automaton)));
    }
    /**
     * Test of complete method, of class FA_algorithms.
     */
    @Test
    public void testComplete() {
        /**
        * Exercise 1 - Slides
        */
        State S = new State("S", true);
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", false);
        State F = new State("F", true);
        
        State initialA = S;
      
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(S);
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(F);
        
        S.setTransitions('a', A);
        S.setTransitions('b', B);
        S.setTransitions('b', F);
        S.setTransitions('c', S);
        S.setTransitions('c', F);
        A.setTransitions('a', S);
        A.setTransitions('a', F);
        A.setTransitions('b', C);
        A.setTransitions('c', A);
        B.setTransitions('a', A);
        B.setTransitions('c', B);
        B.setTransitions('c', S);
        B.setTransitions('c', F);
        C.setTransitions('a', S);
        C.setTransitions('a', F);
        C.setTransitions('c', A);
        C.setTransitions('c', C);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
              
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA ); 
               
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(false, f.isComplete(automaton));
	f.complete(automaton);
        assertEquals(true, f.isComplete(automaton.getComplete()));
        assertEquals(false, f.isComplete(automaton));
    }

    /**
     * Test of minimize method, of class FA_algorithms.
     */
    @Test
    public void testMinimize() {
         /**
        * Exercise 1 - Slides
        */
        State S = new State("S", true);
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", false);
        State F = new State("F", true);
        
        State initialA = S;
      
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(S);
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(F);
        
        S.setTransitions('a', A);
        S.setTransitions('b', B);
        S.setTransitions('b', F);
        S.setTransitions('c', S);
        S.setTransitions('c', F);
        A.setTransitions('a', S);
        A.setTransitions('a', F);
        A.setTransitions('b', C);
        A.setTransitions('c', A);
        B.setTransitions('a', A);
        B.setTransitions('c', B);
        B.setTransitions('c', S);
        B.setTransitions('c', F);
        C.setTransitions('a', S);
        C.setTransitions('a', F);
        C.setTransitions('c', A);
        C.setTransitions('c', C);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
              
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA ); 
               
        FA_algorithms f = new FA_algorithms();
        
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
        FiniteAutomaton min = new FiniteAutomaton(st, alphabet, init); 
        
        assertEquals(min, f.minimize(automaton));
    }

    /**
     * Test of union method, of class FA_algorithms.
     */
    @Test
    public void testUnion() {
        /**
        * Language not exist (00)
        */
        State q0 = new State("q0", true);
        State q1 = new State("q1", true);
       
        State initialA = q0;
        
        ArrayList<State> stateA = new ArrayList<>();
        stateA.add(q0);
        stateA.add(q1);
       
        q0.setTransitions('0', q1);
        q0.setTransitions('1', q0);
        q1.setTransitions('1', q0);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('0');
        alphabet.add('1');
       
        FiniteAutomaton automatonA = new FiniteAutomaton(stateA, alphabet, initialA);
        
        /**
        * Language not exist (11)
        */
        State q2 = new State("q2", true);
        State q3 = new State("q3", true);
       
        State initialB = q2;
       
        ArrayList<State> stateB = new ArrayList<>();
        stateA.add(q2);
        stateA.add(q3);
       
        q0.setTransitions('0', q0);
        q0.setTransitions('1', q1);
        q1.setTransitions('0', q0);
       
        FiniteAutomaton automatonB = new FiniteAutomaton(stateB, alphabet, initialB);
       
        FA_algorithms f = new FA_algorithms();
        
        //Resulting union
        
        State S = new State("S", true);
        State A = new State("A", true);
        State B = new State("B", true);
        State C = new State("C", true);
        State D = new State("D", true);
        
        State init = S;
        
        ArrayList<State> st = new ArrayList<>();
        st.add(S);
        st.add(A);
        st.add(B);
        st.add(C);
        st.add(D);
        
        S.setTransitions('0', B);
        S.setTransitions('0', C);
        S.setTransitions('1', A);
        S.setTransitions('1', D);
        A.setTransitions('0', B);
        A.setTransitions('1', A);
        B.setTransitions('1', A);
        C.setTransitions('0', C);
        C.setTransitions('1', D);
        D.setTransitions('0', C);
        FiniteAutomaton res = new FiniteAutomaton(st, alphabet, init);
        
        
        assertEquals(res, f.union(automatonA, automatonB));
    }

    /**
     * Test of complement method, of class FA_algorithms.
     */
    @Test
    public void testComplement() {
    /**
     * Language not exist (00)
     */
        State q0 = new State("q0", true);
        State q1 = new State("q1", true);
       
        State initialA = q0;
        
        ArrayList<State> stateA = new ArrayList<>();
        stateA.add(q0);
        stateA.add(q1);
       
        q0.setTransitions('0', q1);
        q0.setTransitions('1', q0);
        q1.setTransitions('1', q0);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('0');
        alphabet.add('1');
       
        FiniteAutomaton automaton = new FiniteAutomaton(stateA, alphabet, initialA);
        
        FA_algorithms f = new FA_algorithms();
      
        assertEquals(false, f.isComplete(automaton));
	f.complete(automaton);
        assertEquals(true, f.isComplete(automaton));
        
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", true);
        
        ArrayList<State> st = new ArrayList<>();
        st.add(A);
        st.add(B);
        st.add(C);
        
        State init = A;
        
        A.setTransitions('0', B);
        A.setTransitions('1', A);
        B.setTransitions('0', C);
        B.setTransitions('1', A);
        C.setTransitions('0', C);
        C.setTransitions('1', C);
        
        FiniteAutomaton comp = new FiniteAutomaton(st, alphabet, init);
       
        assertEquals(comp, f.complement(automaton));
       
    }


    /**
     * Test of reverse method, of class FA_algorithms.
     */
    @Test
    public void testReverse() {
        State q0 = new State("q0", false);
        State q1 = new State("q1", false);
        State q2 = new State("q2", true);
        State q3 = new State("q3", false);
        State q4 = new State("q4", true);
        
        ArrayList<State> state = new ArrayList();
        state.add(q0);
        state.add(q1);
        state.add(q2);
        state.add(q3);
        state.add(q4);
        
        State initial = q0;
        
        q0.setTransitions('a', q1);
        q1.setTransitions('b', q2);
        q0.setTransitions('c', q3);
        q3.setTransitions('d', q4);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        
        FiniteAutomaton automaton = new FiniteAutomaton(state, alphabet, initial);
        
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(true, f.recognize(f.reverse(automaton), "ba"));
        assertEquals(true, f.recognize(f.reverse(automaton), "dc"));
        assertEquals(false, f.recognize(f.reverse(automaton), "ab"));
        assertEquals(false, f.recognize(f.reverse(automaton), "cd"));

    }

    /**
     * Test of recognize method, of class FA_algorithms.
     */
    @Test
    public void testRecognize() {
                /**
        * Language not exist (00) and not exist (11)
        */
        
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
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA); 
        
        FA_algorithms f = new FA_algorithms();
        
        assertEquals(true, f.recognize(automaton, "01010"));
        assertEquals(true, f.recognize(automaton, "01010"));
    }

    /**
     * Test of enumeration method, of class FA_algorithms.
     */
    @Test
    public void testEnumeration() {
        
    }
    
}
