/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarbonFootPrintPackage;

/**
 *
 * @author cjt1496
 */
import Utilities.CarbonFootPrintInterface;
import java.util.Scanner;
public class Bicycle implements CarbonFootPrintInterface {
    private int handleBars;
    private boolean KickStand;
    
    double emissionConversionFactor;
    double distanceTraveled;
    int numberOfTimesTraveled;
    
    Scanner input = new Scanner(System.in);
    
    public int getHandleBars() {
        return handleBars;
    }

    public void setHandleBars(int handleBars) {
        this.handleBars = handleBars;
    }

    public boolean isKickStand() {
        return KickStand;
    }

    public void setKickStand(boolean KickStand) {
        this.KickStand = KickStand;
    }

    public double getEmissionConversionFactor() {
        return emissionConversionFactor;
    }

    public void setEmissionConversionFactor(double emissionConversionFactor) {
        this.emissionConversionFactor = emissionConversionFactor;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getNumberOfTimesTraveled() {
        return numberOfTimesTraveled;
    }

    public void setNumberOfTimesTraveled(int numberOfTimesTraveled) {
        this.numberOfTimesTraveled = numberOfTimesTraveled;
    }
    
    
    public Bicycle(){
        
    }

    public Bicycle(int handleBars, boolean KickStand, double emissionConversionFactor, double distanceTraveled, int numberOfTimesTraveled) {
        this.handleBars = handleBars;
        this.KickStand = KickStand;
        this.emissionConversionFactor = emissionConversionFactor;
        this.distanceTraveled = distanceTraveled;
        this.numberOfTimesTraveled = numberOfTimesTraveled;
    }
    
    
    
    
    public void calculateCarbonFootPrint(){
        System.out.println("Now Calculating Carbon foot print for Bicycle ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter your emissionConversionFactor (Must be a decimal)");
        emissionConversionFactor = input.nextDouble();
        System.out.println("Enter your distance traveled in km (Must be a decimal)");
        distanceTraveled = input.nextDouble();
        System.out.println("Enter the number of times you traveled to your destination");
        numberOfTimesTraveled = input.nextInt();
    }

    
    
    

    @Override
    public void getCarbonFootPrint() {
       System.out.println("The carbon foot print emitted from this bicycle is " + 
               getEmissionConversionFactor() * (getDistanceTraveled() * getNumberOfTimesTraveled()) +"Kg CO2e\n");
    }
    
    
    @Override
    public String toString() {
        return "I am a Bicicyle!!";
    }
    
    
    
}
