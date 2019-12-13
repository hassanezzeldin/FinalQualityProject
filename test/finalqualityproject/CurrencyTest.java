/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalqualityproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Doflamengo Onepiece
 */
public class CurrencyTest {
    
    public CurrencyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of currencyConverter method, of class Currency.
     */
    @Test
    public void testCurrencyConverter() {
        System.out.println("currencyConverter");
        String from = "USD";
        String to = "GBP";
        double v = 25.0;
        Currency instance = new Currency();
        double expResult = 16.5;
        double result = instance.currencyConverter(from, to, v);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
       System.out.println("currencyConverter is working"+result);
    }
    
}
