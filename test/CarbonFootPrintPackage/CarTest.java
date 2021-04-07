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
public class CarTest {
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNumberOfSeats method, of class Car.
     */
    @Test
    public void testGetNumberOfSeats() {
        System.out.println("getNumberOfSeats");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getNumberOfSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfSeats method, of class Car.
     */
    @Test
    public void testSetNumberOfSeats() {
        System.out.println("setNumberOfSeats");
        int numberOfSeats = 0;
        Car instance = new Car();
        instance.setNumberOfSeats(numberOfSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSteeringWheel method, of class Car.
     */
    @Test
    public void testGetSteeringWheel() {
        System.out.println("getSteeringWheel");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSteeringWheel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSteeringWheel method, of class Car.
     */
    @Test
    public void testSetSteeringWheel() {
        System.out.println("setSteeringWheel");
        int steeringWheel = 0;
        Car instance = new Car();
        instance.setSteeringWheel(steeringWheel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmissionConversionFactor method, of class Car.
     */
    @Test
    public void testGetEmissionConversionFactor() {
        System.out.println("getEmissionConversionFactor");
        Car instance = new Car();
        double expResult = 0.0;
        double result = instance.getEmissionConversionFactor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmissionConversionFactor method, of class Car.
     */
    @Test
    public void testSetEmissionConversionFactor() {
        System.out.println("setEmissionConversionFactor");
        double emissionConversionFactor = 0.0;
        Car instance = new Car();
        instance.setEmissionConversionFactor(emissionConversionFactor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistanceTraveled method, of class Car.
     */
    @Test
    public void testGetDistanceTraveled() {
        System.out.println("getDistanceTraveled");
        Car instance = new Car();
        double expResult = 0.0;
        double result = instance.getDistanceTraveled();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistanceTraveled method, of class Car.
     */
    @Test
    public void testSetDistanceTraveled() {
        System.out.println("setDistanceTraveled");
        double distanceTraveled = 0.0;
        Car instance = new Car();
        instance.setDistanceTraveled(distanceTraveled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfTimesTraveled method, of class Car.
     */
    @Test
    public void testGetNumberOfTimesTraveled() {
        System.out.println("getNumberOfTimesTraveled");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getNumberOfTimesTraveled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfTimesTraveled method, of class Car.
     */
    @Test
    public void testSetNumberOfTimesTraveled() {
        System.out.println("setNumberOfTimesTraveled");
        int numberOfTimesTraveled = 0;
        Car instance = new Car();
        instance.setNumberOfTimesTraveled(numberOfTimesTraveled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCarbonFootPrint method, of class Car.
     */
    @Test
    public void testCalculateCarbonFootPrint() {
        System.out.println("calculateCarbonFootPrint");
        Car instance = new Car();
        instance.calculateCarbonFootPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarbonFootPrint method, of class Car.
     */
    @Test
    public void testGetCarbonFootPrint() {
        System.out.println("getCarbonFootPrint");
        Car instance = new Car();
        instance.getCarbonFootPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Car.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Car instance = new Car();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
