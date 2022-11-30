package com.boostjava.training;

public class Employee {

   private String firstName;

   private String lastName;

   private double monthlySalary;

   public Employee(String firstName, String lastName, double monthlySalary) {
      setFirstName(firstName);
      setLastName(lastName);
      setMonthlySalary(monthlySalary);
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public double getMonthlySalary() {
      return this.monthlySalary;
   }

   public void setMonthlySalary(double monthlySalary) {
      if (monthlySalary < 0.0)
         System.out.println("Please enter a correct monthly salary.");
      else
         this.monthlySalary = monthlySalary;
   }

}
