package task;

import java.time.LocalDate;

public class Invoice extends PlaceOrder<Integer> {
  LocalDate invoiceDateCreated;
  LocalDate invoiceDateExpired;
  String bookName;
  int quantity;
  int priceBook;
  
  public Invoice() {
    super();
  }

  public Invoice(int invoiceId, String bookName, int quantity, int priceBook) {
    super(invoiceId);
    this.invoiceDateCreated = LocalDate.now();
    this.invoiceDateExpired = invoiceDateCreated.plusDays(1);
    this.bookName = bookName;
    this.quantity = quantity;
    this.priceBook = priceBook;
  }

  public int calculateTotalPrice() {
    return quantity * priceBook;
  }

  // public void displayInvoiceDetails(int no) {
  //   super.displayInvoiceDetails(no, bookName, quantity, priceBook, calculateTotalPrice(), invoiceDateCreated, invoiceDateExpired);
  // }
}
