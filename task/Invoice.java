package task;

import java.time.LocalDate;

public class Invoice extends PlaceOrder {
  private LocalDate invoiceDateCreated;
  private LocalDate invoiceDateExpired;

  public Invoice(String customerName, String bookName, int quantity, int priceBook) {
    super(customerName, bookName, quantity, priceBook);
    this.invoiceDateCreated = LocalDate.now();
    this.invoiceDateExpired = invoiceDateCreated.plusDays(1);
  }

  public void displayOrderDetails() {
    super.displayOrderDetails();
    System.out.println("Invoice Date Created: " + invoiceDateCreated);
    System.out.println("Invoice Date Expired: " + invoiceDateExpired);
  }
}
