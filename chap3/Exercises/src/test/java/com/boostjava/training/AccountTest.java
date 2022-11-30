package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AccountTest {

   @Parameters({ "name", "deposit", "withdraw" })
   @Test(enabled = true)
   public void run(String name, double deposit, double withdraw) {
      System.out.printf("======================>  %s:%n", "Acount Test()");

      Account myAccount = new Account();
      myAccount.setName(name);
      System.out.printf("The name is: %s%n%n", myAccount.getName());

      Account account1 = new Account("Jack Pawer");
      Account account2 = new Account("Jack Tomasson");
      System.out.printf("The name is: %s%n", account1.getName());
      System.out.printf("The name is: %s%n", account2.getName());

      Account account12 = new Account("Jane Green", 50.00);
      Account account22 = new Account("John Blue", -7.53);

      System.out.printf("Name : %s%n Balance : %.2f%n%n", account12.getName(), account12.getBalance());
      System.out.printf("Name : %s%n Balance : %.2f%n%n", account22.getName(), account22.getBalance());

      account12.depositBalance(deposit);
      System.out.printf("%nadding %.2f to account12 balance%n%n", deposit);
      account22.depositBalance(deposit);
      System.out.printf("%nadding %.2f to account22 balance%n%n", deposit);

      System.out.printf("Name : %s%n Balance : %.2f%n%n", account12.getName(), account12.getBalance());
      System.out.printf("Name : %s%n Balance : %.2f%n%n", account22.getName(), account22.getBalance());

      account12.withdraw(withdraw);
      account22.withdraw(withdraw);

   }
}
