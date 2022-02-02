/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mostra;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marco
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculSuma method, of class Utils.
     */
    @Test
    public void testCalculSuma() {
        System.out.println("calculSuma");
        assertEquals(3, Utils.calculSuma(2, 1));
    }


    /**
     * Test of calculFactorial method, of class Utils.
     */
    @Test
    public void testCalculFactorial() {
        System.out.println("calculFactorial");
        int number = 0;
        int expResult = 0;
        int result = Utils.calculFactorial(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarMaxim method, of class Utils.
     */
    @Test
    public void testValidarMaxim() {
        System.out.println("validarMaxim");
        int maxim = 0;
        boolean expResult = false;
        boolean result = Utils.validarMaxim(maxim);
        assertEquals(expResult, result);
    }
    
}
