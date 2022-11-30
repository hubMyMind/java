package com.boostjava.training;

public class Invoice {

   private String partNumber;

   private String partDescription;

   private int itemNumber;

   private double itemPrice;

   public Invoice(String partNumber, String partDescription, int itemNumber, double itemPrice) {
      setPartNumber(partNumber);
      setPartDescription(partDescription);
      setItemNumber(itemNumber);
      setItemPrice(itemPrice);
   }

   public String getPartNumber() {
      return this.partNumber;
   }

   public void setPartNumber(String partNumber) {
      this.partNumber = partNumber;
   }

   public String getPartDescription() {
      return this.partDescription;
   }

   public void setPartDescription(String partDescription) {
      this.partDescription = partDescription;
   }

   public int getItemNumber() {
      return this.itemNumber;
   }

   public void setItemNumber(int itemNumber) {
      if (itemNumber > 0)
         this.itemNumber = itemNumber;
      else
         this.itemNumber = 0;
   }

   public double getItemPrice() {
      return this.itemPrice;
   }

   public void setItemPrice(double itemPrice) {
      if (itemPrice < 0.0)
         this.itemPrice = 0.0;
      else
         this.itemPrice = itemPrice;
   }

   public double getInvoiceAmount() {
      return getItemNumber() * getItemPrice();
   }

}
