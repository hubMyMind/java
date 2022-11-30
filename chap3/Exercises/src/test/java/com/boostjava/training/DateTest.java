package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class DateTest {

   @Parameters({ "year", "month", "day" })
   @Test(enabled = true)
   public void run(int year, int month, int day) {
      System.out.printf("======================>  %s:%n", "Date Test()");

      Date date = new Date(1985, 10, 25);
      date.displayDate();
      Date date1 = new Date(year, month, day);
      date1.displayDate();

   }
}
