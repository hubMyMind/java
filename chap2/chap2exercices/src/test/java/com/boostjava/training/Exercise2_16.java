package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_16 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void compare2Int(Integer firstNumber, Integer secondNumber) {

      Integer larger = Math.max(firstNumber, secondNumber);
      Integer minor = Math.min(firstNumber, secondNumber);

      if (firstNumber.equals(secondNumber))
         System.out.printf("(:) %d and %d are equal (:) %n", firstNumber, secondNumber);
      else
         System.out.printf("(:) %d is larger than %d (:)%n", larger, minor);
   }

   @Test(enabled = true)
   @Parameters({ "firstNumber", "secondNumber" })
   public void Exercise216(Integer firstNumber, Integer secondNumber) {
      exerciseInfo("Exercise2_16()");
      compare2Int(firstNumber, secondNumber);
   }
}
