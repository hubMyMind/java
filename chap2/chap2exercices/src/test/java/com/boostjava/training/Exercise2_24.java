package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_24 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(Object firstNumber, Object secondNumber, Object thirdNumber, Object fourthNumber,
            Object fifthNumber) {

      System.out.printf("-First Number  = %d%n", firstNumber);
      System.out.printf("-Second Number = %d%n", secondNumber);
      System.out.printf("-Third Number = %d%n", thirdNumber);
      System.out.printf("-Fourth Number = %d%n", fourthNumber);
      System.out.printf("-Fifth Number = %d%n", fifthNumber);
   }

   private static void display(String operation, Integer value) {
      System.out.printf("The %s is %d\n", operation, value);
   }

   private static void compare5Int(Integer firstNumber, Integer secondNumber, Integer thirdNumber, Integer fourthNumber,
            Integer fifthNumber) {

      Integer larger = Math.max(Math.max(Math.max(Math.max(firstNumber, secondNumber), thirdNumber), fourthNumber),
               fifthNumber);
      Integer minor = Math.min(Math.min(Math.min(Math.min(firstNumber, secondNumber), thirdNumber), fourthNumber),
               fifthNumber);
      System.out.printf("(:) %d is the smallest (:)%n", minor);
      System.out.printf("(:) %d is the largest (:)%n", larger);
   }

   @Test(enabled = true)
   @Parameters({ "firstNumber", "secondNumber", "thirdNumber", "fourthNumber", "fifthNumber" })
   public void Exercise224(Integer firstNumber, Integer secondNumber, Integer thirdNumber, Integer fourthNumber,
            Integer fifthNumber) {
      exerciseInfo("Exercise2_24()");
      argsInfo(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
      compare5Int(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);

   }
}
