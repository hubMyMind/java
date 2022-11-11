package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_28 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(int radius) {

      System.out.printf("Radius  = %d%n", radius);
   }

   @Parameters({ "radius" })
   @Test(enabled = true)
   public void run(int radius) {
      exerciseInfo("Exercise2_28()");
      argsInfo(radius);
      System.out.printf("Diameter : %d%n", 2 * radius);
      System.out.printf("Circumference : %.2f%n", 2 * Math.PI * radius);
      System.out.printf("Circumference : %.2f%n", Math.PI * radius * radius);
   }
}
