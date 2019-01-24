/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Personal
 */
public class OperacionesNGTest {
    
    public OperacionesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.suma(a, b);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.resta(a, b);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.multiplicacion(a, b);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float a = 0.0F;
        float b = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.division(a, b);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
