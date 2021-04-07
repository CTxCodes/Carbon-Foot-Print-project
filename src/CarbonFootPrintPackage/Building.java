/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarbonFootPrintPackage;

import Utilities.CarbonFootPrintInterface;
import java.util.Scanner;

/**
 *
 * @author cjt1496
 */
public class Building implements CarbonFootPrintInterface {

    private int numberOfFloors;
    private int numberOfJanitors;
    private boolean isBuildingOpenOrClosed;

    double naturalGasConsumed;
    
    
    Scanner input = new Scanner(System.in);

    public double getNaturalGasConsumed() {
        return naturalGasConsumed;
    }

    public void setNaturalGasConsumed(double naturalGasConsumed) {
        this.naturalGasConsumed = naturalGasConsumed;
    }

    

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfJanitors() {
        return numberOfJanitors;
    }

    public void setNumberOfJanitors(int numberOfJanitors) {
        this.numberOfJanitors = numberOfJanitors;
    }

    public boolean isIsBuildingOpenOrClosed() {
        return isBuildingOpenOrClosed;
    }

    public void setIsBuildingOpenOrClosed(boolean isBuildingOpenOrClosed) {
        this.isBuildingOpenOrClosed = isBuildingOpenOrClosed;
    }
    
    
    public Building(){
        
    }

    public Building(int numberOfFloors, int numberOfJanitors, boolean isBuildingOpenOrClosed, double naturalGasConsumed) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfJanitors = numberOfJanitors;
        this.isBuildingOpenOrClosed = isBuildingOpenOrClosed;
        this.naturalGasConsumed = naturalGasConsumed;
    }
   

    public void calculateCarbonFootPrint(){
        System.out.println("Now Calculating Carbon foot print for a Building ");
        System.out.println("--------------------------------------------------------");
        System.out.println("How many therms of natural gas has your building consumed?");
        naturalGasConsumed = input.nextDouble();

    }


    @Override
    public void  getCarbonFootPrint() {
        
        
       System.out.println("The carbon foot print emitted from this building is " + 
               (getNaturalGasConsumed() * 11.7) + " pounds of CO2 from natural gas use.\n");
    }
    
    
    @Override
    public String toString() {
        return "I am a Building!!";
    }
    
}
