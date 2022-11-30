package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_34 {

   @Test(enabled = true)
   @Parameters({ "currentWorldPopulation", "annualGrowthRate" })
   public void run(double currentWorldPopulation, double annualGrowthRate) {
      double growthPerYear;
      System.out.printf("======================>  %s:%n", "Exercise2_34");
      System.out.printf("-Current World Population    = %.2f%n", currentWorldPopulation);
      System.out.printf("-Annual World Growth Rate    = %.2f%n", annualGrowthRate);
      growthPerYear = (currentWorldPopulation * annualGrowthRate) / 100;
      System.out.printf("-Annual World Growth    = %.2f%n", growthPerYear);
      System.out.printf("-World Population = %.2f%n", currentWorldPopulation);
      System.out.printf("-World Population after 1 year  = %.2f%n", currentWorldPopulation + 1 * growthPerYear);
      System.out.printf("-World Population after 2 year  = %.2f%n", currentWorldPopulation + 2 * growthPerYear);
      System.out.printf("-World Population after 3 year  = %.2f%n", currentWorldPopulation + 3 * growthPerYear);
      System.out.printf("-World Population after 4 year  = %.2f%n", currentWorldPopulation + 4 * growthPerYear);
      System.out.printf("-World Population after 5 year  = %.2f%n", currentWorldPopulation + 5 * growthPerYear);
   }

}
