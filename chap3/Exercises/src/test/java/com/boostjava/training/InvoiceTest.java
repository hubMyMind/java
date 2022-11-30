package com.boostjava.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class InvoiceTest {

   @Parameters({ "part", "description", "quantity", "price" })
   @Test(enabled = true)
   public void run(String part, String description, int quantity, double price) {
      System.out.printf("======================>  %s:%n", "Invoice Test()");

      Invoice myInvoice = new Invoice(part, description, quantity, price);
      myInvoice.setItemNumber(quantity);
      myInvoice.setItemPrice(price);
      System.out.printf("Invoice Amount : %.2f%n", myInvoice.getInvoiceAmount());

   }
}
