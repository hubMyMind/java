package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppTest {

   private static void exerciseInfo(String exerciseNbr) {
      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(Object firstNumber, Object secondNumber, Object thirdNumber) {
      System.out.printf("============> firstNumber : %d%n", firstNumber);
      System.out.printf("============> secondNumber : %d%n", secondNumber);

      if (!thirdNumber.equals(null))
         System.out.printf("============> thirdNumber : %d%n", (Integer) thirdNumber);
   }

   private static void display(String operation, Integer value) {
      System.out.printf("The %s is %d\n", operation, value);
   }

   private static void compare(Integer firstNumber, Integer secondNumber) {
      Integer larger = Math.max(firstNumber, secondNumber);
      Integer minor = Math.min(firstNumber, secondNumber);

      if (firstNumber.equals(secondNumber))
         System.out.printf("(:) %d and %d are equal (:) %n", firstNumber, secondNumber);
      else
         System.out.printf("(:) %d is larger than %d (:)%n", larger, minor);
   }

   @Test(enabled = true)
   public void Exercise2_14() {
      exerciseInfo("Exercise2_14()");
      System.out.println("One println statement :");
      System.out.println("1 2 3 4");
      System.out.println("Four statement :");
      System.out.print("1 ");
      System.out.print("2 ");
      System.out.print("3 ");
      System.out.print("4\n");
      System.out.println("One printf statement :");
      System.out.printf("%d %d %d %d\n ", 1, 2, 3, 4);
   }

   @Test(enabled = false)
   @Parameters({ "firstNumber", "secondNumber" })
   public void Exercise2_15(Integer firstNumber, Integer secondNumber) {
      exerciseInfo("Exercise2_15()");
      argsInfo(firstNumber, secondNumber, null);

      display("sum", (firstNumber + secondNumber));
      display("product", (firstNumber * secondNumber));
      display("difference", Math.abs(firstNumber - secondNumber));
      if (secondNumber != 0)
         display("division", (firstNumber / secondNumber));

   }

   @Test(enabled = true)
   @Parameters({ "firstNumber", "secondNumber" })
   public void Exercise2_16(Integer firstNumber, Integer secondNumber) {
      exerciseInfo("Exercise2_16()");
      compare(firstNumber, secondNumber);
   }

   @Test(enabled = true)
   @Parameters({ "firstNumber", "secondNumber", "thirdNumber" })
   public void Exercise2_17(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
      exerciseInfo("Exercise2_17()");
      display("sum", (firstNumber + secondNumber + thirdNumber));
      display("product", (firstNumber * secondNumber * thirdNumber));
      display("average", (firstNumber + secondNumber + thirdNumber) / 3);

   }

}
