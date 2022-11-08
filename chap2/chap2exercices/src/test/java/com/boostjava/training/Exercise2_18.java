package com.boostjava.training;

import org.testng.annotations.Test;

public class Exercise2_18 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   @Test(enabled = true)
   public void Exercise218() {
      exerciseInfo("Exercise2_18()");
      System.out.println("*********       ***          *         *                ");
      System.out.println("*       *     *     *       ***       *  *              ");
      System.out.println("*       *     *     *      *****    *      *            ");
      System.out.println("*       *     *     *        *     *         *          ");
      System.out.println("*       *     *     *        *    *           *         ");
      System.out.println("*       *     *     *        *     *         *          ");
      System.out.println("*       *     *     *        *       *      *           ");
      System.out.println("*       *     *     *        *         *   *            ");
      System.out.println("*********       ***          *           *              ");
      System.out.printf("*%n**%n***%n****%n*****%n");
   }
}
