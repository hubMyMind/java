package com.boostjava.training;

/**
 * Account class .
 */

public class Account {

   private String name;

   private double balance;

   // constructor initializes name with parameter name
   public Account(String name) {
      setName(name);
   }

   public Account(String name, double initialBalance) {
      setName(name);
      if (initialBalance > 0.0)
         setBalance(initialBalance);
   }

   public Account() {
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getBalance() {
      return this.balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public void depositBalance(double amount) {
      if (amount > 0.0)
         setBalance(getBalance() + amount);
   }

   public void withdraw(double amount) {
      if (amount > getBalance())
         System.out.println("Withdrawal amount exceeded account balance.");
      else {
         setBalance(getBalance() - amount);
         System.out.printf("New balance : %.2f%n", getBalance());
      }
   }
}
