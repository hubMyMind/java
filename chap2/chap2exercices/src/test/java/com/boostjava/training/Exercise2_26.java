package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_26 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(int number1, int number2) {

      System.out.printf("Number 1  = %d%n", number1);
      System.out.printf("Number 2  = %d%n", number2);
   }

   private static void multiple(int number1, int number2) {
      int max = Math.max(number1, number2);
      int min = Math.min(number1, number2);

      if (max % min == 0)
         System.out.println("Numbers are multiple.");
      else
         System.out.println("Numbers are not multiple.");
   }

   @Parameters({ "number1", "number2" })
   @Test(enabled = true)
   public void Exercise226(int number1, int number2) {
      exerciseInfo("Exercise2_26()");
      argsInfo(number1, number2);
      multiple(number1, number2);
   }
}
