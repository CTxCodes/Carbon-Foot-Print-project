/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author cjt1496
 */

import CarbonFootPrintPackage.Bicycle;
import CarbonFootPrintPackage.Building;
import CarbonFootPrintPackage.Car;
import java.util.ArrayList;


public class ProcessCarbonFootPrintData {
    
    public void createCarbonFootPrint(){
        
        Building newBuilding = new Building();
        Car newCar = new Car();
        Bicycle newBicycle = new Bicycle();
        
        newBuilding.calculateCarbonFootPrint();
        newCar.calculateCarbonFootPrint();
        newBicycle.calculateCarbonFootPrint();
        
        ArrayList footPrint = new ArrayList();
        footPrint.add(newBuilding);
        footPrint.add(newCar);
        footPrint.add(newBicycle);
        
        for (Object footPrint1 : footPrint) {
            if (footPrint1 instanceof Car) {
                ((Car) footPrint1).getCarbonFootPrint();
            } else if (footPrint1 instanceof Building) {
                ((Building) footPrint1).getCarbonFootPrint();
            } else if (footPrint1 instanceof Bicycle){
                ((Bicycle) footPrint1).getCarbonFootPrint();
            }
        }
        
        
        
       }
        
    }
    

