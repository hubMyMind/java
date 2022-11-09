package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_15 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(Object firstNumber, Object secondNumber) {

      System.out.printf("-First Number  = %d%n", firstNumber);
      System.out.printf("-Second Number = %d%n", secondNumber);
   }

   private static void display(String operation, Integer value) {
      System.out.printf("The %s is %d\n", operation, value);
   }

   @Test(enabled = true)
   @Parameters({ "firstNumber", "secondNumber" })
   public void Exercise215(Integer firstNumber, Integer secondNumber) {
      exerciseInfo("Exercise2_15()");
      argsInfo(firstNumber, secondNumber);

      display("sum", (firstNumber + secondNumber));
      display("product", (firstNumber * secondNumber));
      display("difference", Math.abs(firstNumber - secondNumber));
      if (secondNumber != 0)
         display("division", (firstNumber / secondNumber));

   }
}
