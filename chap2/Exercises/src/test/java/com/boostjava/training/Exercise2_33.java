package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_33 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);

      System.out.println("BMI VALUES");
      System.out.println("Underweight: less than 18.5");
      System.out.println("Normal: between 18.5 and 24.9"); //
      System.out.println("Overweight: between 25 and 29.9");
      System.out.println("Obese: 30 or greater");
   }

   private static void argsInfo(Object weightInKilograms, Object heightInMeters) {

      System.out.printf("-weightInKilograms = %.2f%n", weightInKilograms);
      System.out.printf("-heightInMeters    = %.2f%n", heightInMeters);
   }

   @Test(enabled = true)
   @Parameters({ "weightInKilograms", "heightInMeters" })
   public void run(double weightInKilograms, double heightInMeters) {
      exerciseInfo("Exercise2_33()");
      argsInfo(weightInKilograms, heightInMeters);
      double BMI;
      BMI = weightInKilograms / (heightInMeters * heightInMeters);
      System.out.printf("BMI = %f%n", BMI);
      if (BMI < 18.5)
         System.out.println("Underweight");
      if ((BMI >= 18.5) && (BMI <= 24.9))
         System.out.println("Normal");
      if ((BMI >= 25) && (BMI < 29.9))
         System.out.println("Overweight");
      if (BMI >= 30)
         System.out.println("Obese");
   }

}
