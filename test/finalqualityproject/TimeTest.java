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
public class TimeTest {
    
    public TimeTest() {
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
     * Test of conv method, of class Time.
     */
    @Test
    public void testConv() {
        System.out.println("conv");
        String city = "cairo";
        Time instance = new Time();
        String expResult = "22:38";
        String result = instance.conv(city);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       System.out.println("conv is working");
    }
    
}
