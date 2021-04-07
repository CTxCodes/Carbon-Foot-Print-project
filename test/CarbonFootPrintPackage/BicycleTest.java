/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarbonFootPrintPackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cjt1496
 */
public class BicycleTest {
    
    public BicycleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    /**
     * Test of getEmissionConversionFactor method, of class Bicycle.
     */
    @Test
    public void testGetEmissionConversionFactor() {
        System.out.println("getEmissionConversionFactor");
        Bicycle instance = new Bicycle();
        double expResult = 0.0;
        double result = instance.getEmissionConversionFactor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmissionConversionFactor method, of class Bicycle.
     */
    @Test
    public void testSetEmissionConversionFactor() {
        System.out.println("setEmissionConversionFactor");
        double emissionConversionFactor = 0.0;
        Bicycle instance = new Bicycle();
        instance.setEmissionConversionFactor(emissionConversionFactor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTraveled method, of class Bicycle.
     */
    @Test
    public void testGetDistanceTraveled() {
        System.out.println("getDistanceTraveled");
        Bicycle instance = new Bicycle();
        double expResult = 0.0;
        double result = instance.getDistanceTraveled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTraveled method, of class Bicycle.
     */
    @Test
    public void testSetDistanceTraveled() {
        System.out.println("setDistanceTraveled");
        double distanceTraveled = 0.0;
        Bicycle instance = new Bicycle();
        instance.setDistanceTraveled(distanceTraveled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfTimesTraveled method, of class Bicycle.
     */
    @Test
    public void testGetNumberOfTimesTraveled() {
        System.out.println("getNumberOfTimesTraveled");
        Bicycle instance = new Bicycle();
        int expResult = 0;
        int result = instance.getNumberOfTimesTraveled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfTimesTraveled method, of class Bicycle.
     */
    @Test
    public void testSetNumberOfTimesTraveled() {
        System.out.println("setNumberOfTimesTraveled");
        int numberOfTimesTraveled = 0;
        Bicycle instance = new Bicycle();
        instance.setNumberOfTimesTraveled(numberOfTimesTraveled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCarbonFootPrint method, of class Bicycle.
     */
    @Test
    public void testCalculateCarbonFootPrint() {
        System.out.println("calculateCarbonFootPrint");
        Bicycle instance = new Bicycle();
        instance.calculateCarbonFootPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarbonFootPrint method, of class Bicycle.
     */
    @Test
    public void testGetCarbonFootPrint() {
        System.out.println("getCarbonFootPrint");
        Bicycle instance = new Bicycle();
        instance.getCarbonFootPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bicycle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bicycle instance = new Bicycle();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
