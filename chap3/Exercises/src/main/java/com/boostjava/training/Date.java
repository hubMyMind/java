package com.boostjava.training;

public class Date {

   private int month;

   private int day;

   private int year;

   boolean isValidDay = false;

   boolean isValidMonth = false;

   boolean isValidYear = false;

   public Date(int year, int month, int day) {
      setDay(day);
      setMonth(month);
      setYear(year);
   }

   public void setDay(int day) {
      if (day < 0 || day > 31)
         System.out.println("Please enter a valid day");
      else {
         isValidDay = true;
         this.day = day;
      }
   }

   public int getDay() {
      return this.day;
   }

   public void setMonth(int month) {
      if (month < 0 || month > 12)
         System.out.println("Please enter a valid month");
      else {
         isValidMonth = true;
         this.month = month;
      }
   }

   public int getMonth() {
      return this.month;
   }

   public void setYear(int year) {
      if (year < 1700)
         System.out.println("Please enter a valid year");
      else {
         isValidYear = true;
         this.year = year;
      }
   }

   public int getYear() {
      return this.year;
   }

   public void displayDate() {
      if (isValidYear && isValidMonth && isValidDay)
         System.out.printf("Date: %d/%d/%d%n", getYear(), getMonth(), getDay());
   }

}
