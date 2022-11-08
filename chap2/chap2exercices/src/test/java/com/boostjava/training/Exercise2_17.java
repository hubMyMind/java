package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_17 {

   private static void exerciseInfo(String exerciseNbr) {
      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(Object firstNumber, Object secondNumber, Object thirdNumber) {
      System.out.printf("-First Number  = %d%n", firstNumber);
      System.out.printf("-Second Number = %d%n", secondNumber);
      System.out.printf("-Third Number = %d%n", thirdNumber);
   }

   private static void display(String operation, Integer value) {
      System.out.printf("The %s is %d\n", operation, value);
   }

   @Test(enabled = true)
   @Parameters({ "firstNumber", "secondNumber", "thirdNumber" })
   public void Exercise2_17(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
      exerciseInfo("Exercise2_17()");
      argsInfo(firstNumber, secondNumber, thirdNumber);
      display("sum", (firstNumber + secondNumber + thirdNumber));
      display("product", (firstNumber * secondNumber * thirdNumber));
      display("average", (firstNumber + secondNumber + thirdNumber) / 3);

   }
}