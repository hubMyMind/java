package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class EmployeeTest {

   @Parameters({ "firstName", "lastName", "salary" })
   @Test(enabled = true)
   public void run(String firstName, String lastName, double salary) {
      System.out.printf("======================>  %s:%n", "Employee Test()");

      Employee employee = new Employee("Moez", "Daved", 50000.00);
      Employee employee1 = new Employee(firstName, lastName, salary);
      System.out.println("Employee :");
      System.out.printf("The fisrt name is: %s%n%n", employee.getFirstName());
      System.out.printf("The last name is: %s%n%n", employee.getLastName());
      System.out.printf("The monthly Salary is: %s%n%n", employee.getMonthlySalary());

      System.out.println("Employee 1 :");
      System.out.printf("The fisrt name is: %s%n%n", employee1.getFirstName());
      System.out.printf("The last name is: %s%n%n", employee1.getLastName());
      System.out.printf("The monthly Salary is: %s%n%n", employee1.getMonthlySalary());

   }
}
