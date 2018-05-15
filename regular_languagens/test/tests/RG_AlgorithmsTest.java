/*
 * Tests to RG_Algorithms.java
 */
package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import regular_grammar.RG_Algorithms;
import regular_grammar.RegularGrammar;


public class RG_AlgorithmsTest {
    
    public RG_AlgorithmsTest() {
    }
    

    /**
     * Test of union method, of class RG_Algorithms.
     */
    @Test
    public void testUnion() {
        RegularGrammar ga = new RegularGrammar();
        ga.setInitialSymbol("S");
        ga.setProductions("S", "&");
        ga.setProductions("S", "aA");
        ga.setProductions("S", "a");
        ga.setProductions("A", "aA");
        ga.setProductions("A", "a");
        
        RegularGrammar gb = new RegularGrammar();
        gb.setInitialSymbol("S");
        gb.setProductions("S", "&");
        gb.setProductions("S", "bA");
        gb.setProductions("S", "b");
        gb.setProductions("A", "bA");
        gb.setProductions("A", "b");
        
        RegularGrammar result = new RegularGrammar();
        result.setInitialSymbol("U");
        result.setProductions("U", "&");
        result.setProductions("U", "aA");
        result.setProductions("U", "a");
        result.setProductions("U", "&");
        result.setProductions("U", "bA´");
        result.setProductions("U", "b");
        
        result.setProductions("S", "&");
        result.setProductions("S", "aA");
        result.setProductions("S", "a");
        result.setProductions("A", "aA");
        result.setProductions("A", "a");
        result.setProductions("S´", "&");
        result.setProductions("S´", "bA´");
        result.setProductions("S´", "b");
        result.setProductions("A´", "bA´");
        result.setProductions("A´", "b");
        
        RG_Algorithms rg = new RG_Algorithms();
        
        assertEquals(result.toString(), rg.concatenation(ga, gb).toString());
        
    }

    /**
     * Test of concatenation method, of class RG_Algorithms.
     */
    @Test
    public void testConcatenation() {
        RegularGrammar ga = new RegularGrammar();
        ga.setInitialSymbol("S");
        ga.setProductions("S", "&");
        ga.setProductions("S", "aA");
        ga.setProductions("S", "a");
        ga.setProductions("A", "aA");
        ga.setProductions("A", "a");
        
        RegularGrammar gb = new RegularGrammar();
        gb.setInitialSymbol("S");
        gb.setProductions("S", "&");
        gb.setProductions("S", "bA");
        gb.setProductions("S", "b");
        gb.setProductions("A", "bA");
        gb.setProductions("A", "b");
        
        RegularGrammar result = new RegularGrammar();
        result.setInitialSymbol("S");
        result.setProductions("S", "&");
        result.setProductions("S", "aA");
        result.setProductions("S", "aS´");
        result.setProductions("A", "aA");
        result.setProductions("A", "aS´");
        
        result.setProductions("S´", "&");
        result.setProductions("S´", "bA´");
        result.setProductions("S´", "b");
        result.setProductions("A´", "bA´");
        result.setProductions("A´", "b");
        
        RG_Algorithms rg = new RG_Algorithms();

        
        assertEquals(result.toString(), rg.concatenation(ga, gb).toString());
    }

    /**
     * Test of closure method, of class RG_Algorithms.
     */
    @Test
    public void testClosure() {
        RegularGrammar ga = new RegularGrammar();
        ga.setInitialSymbol("S");
        ga.setProductions("S", "&");
        ga.setProductions("S", "aA");
        ga.setProductions("S", "a");
        ga.setProductions("S", "bB");
        ga.setProductions("S", "b");
        ga.setProductions("A", "aA");
        ga.setProductions("A", "a");
        ga.setProductions("A", "bB");
        ga.setProductions("A", "b");
        ga.setProductions("B", "bB");
        ga.setProductions("B", "b");
        
        RegularGrammar result = new RegularGrammar();
        result.setInitialSymbol("S");
        result.setProductions("S", "&");
        result.setProductions("S", "aA");
        result.setProductions("S", "a");
        result.setProductions("S", "aS");
        result.setProductions("S", "bB");
        result.setProductions("S", "b");
        result.setProductions("S", "bS");
        result.setProductions("A", "aA");
        result.setProductions("A", "a");
        result.setProductions("A", "aS");
        result.setProductions("A", "bB");
        result.setProductions("A", "b");
        result.setProductions("A", "bS");
        result.setProductions("B", "bB");
        result.setProductions("B", "b");
        result.setProductions("B", "bS");
        
        RG_Algorithms rg = new RG_Algorithms();
        
        assertEquals(result.toString(), rg.closure(ga).toString());
        
    }
    
}
