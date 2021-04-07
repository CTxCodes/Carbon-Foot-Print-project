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
public class Car implements CarbonFootPrintInterface {
   private int numberOfSeats;
   private int steeringWheel;
    
    double emissionConversionFactor;
    double distanceTraveled;
    int numberOfTimesTraveled;
    
    Scanner input = new Scanner(System.in);

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(int steeringWheel) {
        this.steeringWheel = steeringWheel;
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

    
    public Car(){
        
    }

    public Car(int numberOfSeats, int steeringWheel, double emissionConversionFactor, double distanceTraveled, int numberOfTimesTraveled) {
        this.numberOfSeats = numberOfSeats;
        this.steeringWheel = steeringWheel;
        this.emissionConversionFactor = emissionConversionFactor;
        this.distanceTraveled = distanceTraveled;
        this.numberOfTimesTraveled = numberOfTimesTraveled;
    }
    
    
      public void calculateCarbonFootPrint(){
        System.out.println("Now Calculating Carbon foot print for a Car ");
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
       System.out.println("The carbon foot print emitted from this car is " + 
               getEmissionConversionFactor() * (getDistanceTraveled() * getNumberOfTimesTraveled()) +"Kg CO2e\n");
    }
    
    @Override
    public String toString() {
        return "I am a car!!";
    }
    
}
