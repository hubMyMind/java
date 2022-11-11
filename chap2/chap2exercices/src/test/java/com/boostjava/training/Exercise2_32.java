package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Exercise2_32 {

   private static void exerciseInfo(String exerciseNbr) {

      System.out.printf("======================>  %s:%n", exerciseNbr);
   }

   private static void argsInfo(Object nbr, Object nbr1, Object nbr2, Object nbr3, Object nbr4) {

      System.out.printf("-nbr  = %d%n", nbr);
      System.out.printf("-nbr1 = %d%n", nbr1);
      System.out.printf("-nbr2  = %d%n", nbr2);
      System.out.printf("-nbr3 = %d%n", nbr3);
      System.out.printf("-nbr4  = %d%n", nbr4);
   }

   @Test(enabled = true)
   @Parameters({ "nbr", "nbr1", "nbr2", "nbr3", "nbr4" })
   public void run(int nbr, int nbr1, int nbr2, int nbr3, int nbr4) {
      exerciseInfo("Exercise2_32()");
      argsInfo(nbr, nbr1, nbr2, nbr3, nbr4);
      int positiveCounter = 0;
      int negativeCounter = 0;
      int zerosCounter = 0;

      if (nbr > 0)
         positiveCounter = positiveCounter + 1;
      if (nbr < 0)
         negativeCounter = negativeCounter + 1;
      if (nbr == 0)
         zerosCounter = zerosCounter + 1;

      if (nbr1 > 0)
         positiveCounter = positiveCounter + 1;
      if (nbr1 < 0)
         negativeCounter = negativeCounter + 1;
      if (nbr1 == 0)
         zerosCounter = zerosCounter + 1;

      if (nbr2 > 0)
         positiveCounter = positiveCounter + 1;
      if (nbr2 < 0)
         negativeCounter = negativeCounter + 1;
      if (nbr2 == 0)
         zerosCounter = zerosCounter + 1;

      if (nbr3 > 0)
         positiveCounter = positiveCounter + 1;
      if (nbr3 < 0)
         negativeCounter = negativeCounter + 1;
      if (nbr3 == 0)
         zerosCounter = zerosCounter + 1;

      if (nbr4 > 0)
         positiveCounter = positiveCounter + 1;
      if (nbr4 < 0)
         negativeCounter = negativeCounter + 1;
      if (nbr4 == 0)
         zerosCounter = zerosCounter + 1;

      System.out.printf("The number of positive numbers input is %d%n", positiveCounter);
      System.out.printf("The number of negative numbers input is %d%n", negativeCounter);
      System.out.printf("The number of zero numbers input is %d%n", zerosCounter);
   }

}
