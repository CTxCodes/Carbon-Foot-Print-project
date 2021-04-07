/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarbonFootPrintPackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author cjt1496
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CarbonFootPrintPackage.BicycleTest.class, CarbonFootPrintPackage.CarbonFootPrintTestTest.class, CarbonFootPrintPackage.CarTest.class, CarbonFootPrintPackage.BuildingTest.class})
public class CarbonFootPrintPackageSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
