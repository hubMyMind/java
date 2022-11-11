package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_30 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(int number) {

      System.out.printf("Number  = %d%n", number);
   }

   @Parameters({ "number" })
   @Test(enabled = true)
   public void run(int number) {
      exerciseInfo("Exercise2_30()");
      argsInfo(number);
      int divResult;
      int divRemaining;
      divResult = number / 10000;
      if (divResult > 10) {
         System.out.println("Please enter a number with five digits(You entered more digits)");
      }
      if (divResult == 0) {
         System.out.println("Please enter a number with five digits (You entered less digits)");
      }
      if (divResult < 10) {
         divRemaining = number % 10000;
         System.out.printf("%d   ", divResult);
         number = divRemaining;
         divResult = number / 1000;
         divRemaining = number % 1000;
         System.out.printf("%d   ", divResult);
         number = divRemaining;
         divResult = number / 100;
         divRemaining = number % 100;
         System.out.printf("%d   ", divResult);
         number = divRemaining;
         divResult = number / 10;
         divRemaining = number % 10;
         System.out.printf("%d   ", divResult);
         System.out.printf("%d%n", divRemaining);

      }
   }
}
