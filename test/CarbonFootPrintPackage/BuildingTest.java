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
public class BuildingTest {
    
    public BuildingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNaturalGasConsumed method, of class Building.
     */
    @Test
    public void testGetNaturalGasConsumed() {
        System.out.println("getNaturalGasConsumed");
        Building instance = new Building();
        double expResult = 0.0;
        double result = instance.getNaturalGasConsumed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNaturalGasConsumed method, of class Building.
     */
    @Test
    public void testSetNaturalGasConsumed() {
        System.out.println("setNaturalGasConsumed");
        double naturalGasConsumed = 0.0;
        Building instance = new Building();
        instance.setNaturalGasConsumed(naturalGasConsumed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfFloors method, of class Building.
     */
    @Test
    public void testGetNumberOfFloors() {
        System.out.println("getNumberOfFloors");
        Building instance = new Building();
        int expResult = 0;
        int result = instance.getNumberOfFloors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfFloors method, of class Building.
     */
    @Test
    public void testSetNumberOfFloors() {
        System.out.println("setNumberOfFloors");
        int numberOfFloors = 0;
        Building instance = new Building();
        instance.setNumberOfFloors(numberOfFloors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfJanitors method, of class Building.
     */
    @Test
    public void testGetNumberOfJanitors() {
        System.out.println("getNumberOfJanitors");
        Building instance = new Building();
        int expResult = 0;
        int result = instance.getNumberOfJanitors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfJanitors method, of class Building.
     */
    @Test
    public void testSetNumberOfJanitors() {
        System.out.println("setNumberOfJanitors");
        int numberOfJanitors = 0;
        Building instance = new Building();
        instance.setNumberOfJanitors(numberOfJanitors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsBuildingOpenOrClosed method, of class Building.
     */
    @Test
    public void testIsIsBuildingOpenOrClosed() {
        System.out.println("isIsBuildingOpenOrClosed");
        Building instance = new Building();
        boolean expResult = false;
        boolean result = instance.isIsBuildingOpenOrClosed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsBuildingOpenOrClosed method, of class Building.
     */
    @Test
    public void testSetIsBuildingOpenOrClosed() {
        System.out.println("setIsBuildingOpenOrClosed");
        boolean isBuildingOpenOrClosed = false;
        Building instance = new Building();
        instance.setIsBuildingOpenOrClosed(isBuildingOpenOrClosed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCarbonFootPrint method, of class Building.
     */
    
    @Test
    public void testCalculateCarbonFootPrint() {
        System.out.println("calculateCarbonFootPrint");
        Building instance = new Building();
        instance.calculateCarbonFootPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarbonFootPrint method, of class Building.
     */
    @Test
    public void testGetCarbonFootPrint() {
        System.out.println("getCarbonFootPrint");
        Building instance = new Building();
        instance.getCarbonFootPrint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Building.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Building instance = new Building();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
