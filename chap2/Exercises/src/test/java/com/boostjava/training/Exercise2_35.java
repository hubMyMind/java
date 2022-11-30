package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_35 {

   @Test(enabled = true)
   @Parameters({ "totalMilesDrivenPerDay", "parkingFeesPerDay", "tollsPerDay" })
   public void run(double totalMilesDrivenPerDay, double parkingFeesPerDay, double tollsPerDay) {

      double costGasolinePerDay;
      double UserCostPerDay;

      System.out.println("(:) Exercise2_35 (:)");
      System.out.println("=============================================================");
      System.out.println("|                    Car-Pool Savings Calculator             |");
      System.out.println("=============================================================");
      System.out.printf("Your total Kilometers driven per day : %.2f%n", totalMilesDrivenPerDay);
      System.out.printf("Your parking fees per day : %.2f%n", parkingFeesPerDay);
      System.out.printf("Your tolls per day  : %.2f%n", tollsPerDay);
      System.out.println("Information :");
      System.out.println("Average kilometers per gallon  : 6.7 L/100 km");
      System.out.println("Cost per gallon of gasoline : 7.771 euros");

      System.out.println("=============================================================");
      costGasolinePerDay = (totalMilesDrivenPerDay * 6.7 / 100) * 7.771;
      UserCostPerDay = tollsPerDay + parkingFeesPerDay + costGasolinePerDay;
      System.out.printf(" Your cost per day of driving to work  : %.2f euros%n", UserCostPerDay);
   }

}
