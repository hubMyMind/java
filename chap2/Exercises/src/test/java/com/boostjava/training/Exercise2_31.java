package com.boostjava.training;

import org.testng.annotations.Test;

public class Exercise2_31 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   @Test(enabled = true)
   public void run() {
      exerciseInfo("Exercise2_31()");
      System.out.println("number square cube");
      System.out.printf("%d      %d      %d%n", 0, 0 * 2, 0 * 3);
      System.out.printf("%d      %d      %d%n", 1, 1 * 1, 1 * 1 * 1);
      System.out.printf("%d      %d      %d%n", 2, 2 * 2, 2 * 2 * 2);
      System.out.printf("%d      %d      %d%n", 3, 3 * 3, 3 * 3 * 3);
      System.out.printf("%d      %d     %d%n", 4, 4 * 4, 4 * 4 * 4);
      System.out.printf("%d      %d     %d%n", 5, 5 * 5, 5 * 5 * 5);
      System.out.printf("%d      %d     %d%n", 6, 6 * 6, 6 * 6 * 6);
      System.out.printf("%d      %d     %d%n", 7, 7 * 7, 7 * 7 * 7);
      System.out.printf("%d      %d     %d%n", 8, 8 * 8, 8 * 8 * 8);
      System.out.printf("%d      %d     %d%n", 9, 9 * 9, 9 * 9 * 9);
      System.out.printf("%d      %d     %d%n", 10, 10 * 10, 10 * 10 * 10);
   }

}
