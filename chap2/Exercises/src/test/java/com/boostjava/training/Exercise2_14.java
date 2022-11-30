package com.boostjava.training;

import org.testng.annotations.Test;

public class Exercise2_14 {

   @Test(enabled = true)
   public void run() {
      System.out.printf("======================>  %s:%n", "Exercise2_14()");
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
}
