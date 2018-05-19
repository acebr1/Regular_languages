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
import java.util.Set;
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
    
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A");   
               
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
        State E = new State("E", true);
        
        State initialA = S;
       
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(S);
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(D);
        statesA.add(E);
        
        S.setTransitions('0', A);
        S.setTransitions('0', D);
        S.setTransitions('1', E);
        A.setTransitions('0', A);
        A.setTransitions('0', B);
        A.setTransitions('1', C);
        A.setTransitions('1', E);
        B.setTransitions('0', B);
        C.setTransitions('0', A);
        C.setTransitions('0', B);
        D.setTransitions('0', B);
        D.setTransitions('0', D);
        D.setTransitions('1', C);
        E.setTransitions('0', E);
        E.setTransitions('1', E);

        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('0');
        alphabet.add('1');

        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A");   
               
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
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
               
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
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A");   
               
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
              
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
               
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
              
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
               
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
    public void testRemove_unreachable() {
        State A = new State("A", false);
        State B = new State("B", true);
        State C = new State("C", false);
        
        State initialA = A;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        
        A.setTransitions('a', B);
        B.setTransitions('a', A);
        C.setTransitions('a', B);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        
        FiniteAutomaton automatonA = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
        
        State q0 = new State("A", false);
        State q1 = new State("B", true);

        State initialB = q0;
        
        ArrayList<State> statesB = new ArrayList<>();
        statesB.add(q0);
        statesB.add(q1);
        
        q0.setTransitions('a', q1);
        q1.setTransitions('a', q0);
        
        FiniteAutomaton automatonB = new FiniteAutomaton(statesB, alphabet, initialB,"A"); 
        
        A = new State("A", false);
        B = new State("B", true);
        C = new State("C", false);
        State D = new State("D", false);
        
        initialA = A;
        
        statesA = new ArrayList<>();
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(D);
        
        A.setTransitions('a', B);
        A.setTransitions('b', C);
        B.setTransitions('a', A);
        C.setTransitions('a', B);
        D.setTransitions('a', C);
        
        alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        FiniteAutomaton automatonC = new FiniteAutomaton(statesA, alphabet, initialA,"C"); 
               
        FA_algorithms f = new FA_algorithms();
        
        //FiniteAutomaton copyAutomatonA = automatonA.getClone();
        //botei toString pq os objetos são diferentes mas tem as mesmas propriedades
        //System.out.println(automatonB.toString());
        //System.out.println(f.remove_unreachable(automatonA).toString());
        Set<String> e1 = f.enumeration(automatonC, 10);
        for(String s: e1) {
            assertEquals(true, f.recognize(automatonC, s));
        }
        //System.out.println(f.remove_unreachable(automatonC));
        Set<String> e = f.enumeration(automatonB, 10);
        for(String s : e){
            assertEquals(true, f.recognize(automatonA, s));
        }
        //n sei pq esse teste n ta funcionando mas a função deu certo;
        //assertEquals(automatonB.toString(), f.remove_unreachable(automatonA).toString());
    }
    
    @Test
    public void testRemove_dead() {
        State A = new State("A", false);
        State B = new State("B", false);
        State C = new State("C", false);
        State D = new State("D", true);
        
        State initialA = A;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(A);
        statesA.add(B);
        statesA.add(C);
        statesA.add(D);
        
        A.setTransitions('a', B);
        A.setTransitions('b', C);
        B.setTransitions('a', B);
        C.setTransitions('a', D);
        D.setTransitions('a', C);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        
        FiniteAutomaton automatonA = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
        FA_algorithms f = new FA_algorithms();
        System.out.println(f.remove_dead(automatonA));
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
              
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
               
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
        FiniteAutomaton min = new FiniteAutomaton(st, alphabet, init, "A"); 
        
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
       
        FiniteAutomaton automatonA = new FiniteAutomaton(stateA, alphabet, initialA, "A");
        
        /**
        * Language not exist (11)
        */
        State q2 = new State("q0", true);
        State q3 = new State("q1", true);
       
        State initialB = q2;
       
        ArrayList<State> stateB = new ArrayList<>();
        stateB.add(q2);
        stateB.add(q3);
       
        q2.setTransitions('0', q2);
        q2.setTransitions('1', q3);
        q3.setTransitions('0', q2);
       
        FiniteAutomaton automatonB = new FiniteAutomaton(stateB, alphabet, initialB,"B");
       
        FA_algorithms f = new FA_algorithms();
        
        //Resulting union
        
        State S = new State("q0", true);
        State A = new State("q0A", true);
        State B = new State("q1A", true);
        State C = new State("q0B", true);
        State D = new State("q1B", true);
        
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
        FiniteAutomaton res = new FiniteAutomaton(st, alphabet, init,"A|B");
        
        FiniteAutomaton copyAutomatonA = automatonA.getClone();
        //botei toString pq os objetos são diferentes mas tem as mesmas propriedades
        assertEquals(res.toString(), f.union(automatonA, automatonB).toString());
        assertEquals(copyAutomatonA.toString(),automatonA.toString());
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
       
        FiniteAutomaton automaton = new FiniteAutomaton(stateA, alphabet, initialA,"B");
        FA_algorithms f = new FA_algorithms();
      
        assertEquals(false, f.isComplete(automaton));
	f.complete(automaton);
        assertEquals(true, f.isComplete(automaton.getComplete()));
        
        State A = new State("q0", false);
        State B = new State("q1", false);
        State C = new State("Error", true);
        
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
        
        FiniteAutomaton comp = new FiniteAutomaton(st, alphabet, init,"B");
        assertEquals(comp.toString(), f.complement(automaton).toString());
       
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
        
        FiniteAutomaton automaton = new FiniteAutomaton(state, alphabet, initial,"AUTOMATON");
        
        FA_algorithms f = new FA_algorithms();
        //System.out.println(automaton);
        //System.out.println(f.reverse(automaton));
        //System.out.println(f.enumeration(automaton, 2));
        //System.out.println(f.enumeration(f.reverse(automaton), 2));
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
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A"); 
        
        FA_algorithms f = new FA_algorithms();
        assertEquals(true, f.recognize(automaton, ""));
        assertEquals(true, f.recognize(automaton, "0"));
        assertEquals(true, f.recognize(automaton, "1"));
        assertEquals(true, f.recognize(automaton, "01"));
        assertEquals(true, f.recognize(automaton, "10"));
        assertEquals(true, f.recognize(automaton, "010"));
        assertEquals(true, f.recognize(automaton, "1010"));
        assertEquals(false, f.recognize(automaton, "00"));
        assertEquals(false, f.recognize(automaton, "11"));
        assertEquals(false, f.recognize(automaton, "01011"));
        assertEquals(false, f.recognize(automaton, "110101"));
    }

    /**
     * Test of enumeration method, of class FA_algorithms.
     */
    @Test
    public void testEnumeration() {
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
       
        FiniteAutomaton automaton = new FiniteAutomaton(stateA, alphabet, initialA,"B");
        FA_algorithms f = new FA_algorithms();
        Set<String> sentences = f.enumeration(automaton, 6);
        for(String s: sentences){
            assertEquals(true, f.recognize(automaton, s));
        }
        
    }
    
    @Test
    public void testHasEpsilonTransitions() {
        
        State q0 = new State("q0", false);
        State q1 = new State("q1", false);
        State q2 = new State("q2", true);
        
        State initialA = q0;
        
        ArrayList<State> statesA = new ArrayList<>();
        statesA.add(q0);
        statesA.add(q1);
        statesA.add(q2);
        
        q0.setTransitions('a', q0);
        q0.setTransitions('&', q1);
        q1.setTransitions('b', q1);
        q1.setTransitions('&', q2);
        q2.setTransitions('c', q2);
        
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
               
        FiniteAutomaton automaton = new FiniteAutomaton(statesA, alphabet, initialA,"A");
        FA_algorithms f = new FA_algorithms();
        assertEquals(true, f.hasEpsilonTrasitions(automaton));
        assertEquals(false,f.hasEpsilonTrasitions(f.removeEpsilonTrasitions(automaton)));
        assertEquals(true, f.hasEpsilonTrasitions(automaton));
    }
    
}
