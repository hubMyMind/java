package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_25 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(Integer number) {

      System.out.printf("Number  = %d%n", number);
   }

   private static void multipleOf2(Integer number) {
      if (number % 2 == 0)
         System.out.println("It is an even number.");
      else
         System.out.println("It is an odd number.");

   }

   @Test(enabled = true)
   @Parameters({ "firstNumber" })
   public void Exercise225(Integer firstNumber) {
      exerciseInfo("Exercise2_25()");
      argsInfo(firstNumber);
      multipleOf2(firstNumber);
   }
}
