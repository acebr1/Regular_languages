/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import regular_grammar.RegularGrammar;
import static org.junit.Assert.*;

/**
 *
 * @author fabiola
 */
public class RegularGrammarTest {
    
    public RegularGrammarTest() {
    }

    /**
     * Test of getClone method, of class RegularGrammar.
     */
    @Test
    public void testGetClone() {
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
        gb.setProductions("S", "aA");
        gb.setProductions("S", "a");
        gb.setProductions("A", "aA");
        gb.setProductions("A", "a");
        
        assertEquals(ga.toString(), ga.getClone().toString());
    }
}
