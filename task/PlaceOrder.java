package task;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public abstract class PlaceOrder {
  String Id;

  public abstract int calculateTotalPrice();

  public PlaceOrder() {
    super();
  }

  public PlaceOrder(String Id) {
    this.Id = Id;
  }
  
  public String formatCurrency(int price) {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    return currencyFormat.format(price);
  }

  public void displayInvoiceDetails(int no, String bookName, int quantity, int priceBook, int totalPrice, LocalDate invoiceDateCreated, LocalDate invoiceDateExpired) {
    System.out.printf("%-4d %-17s %-15s %-12d %-15s %-18s %-15s\n", no, bookName, formatCurrency(priceBook), quantity, formatCurrency(totalPrice), invoiceDateCreated, invoiceDateExpired);
  }

  public void displayPaymentDetails(int no, String bookName, int quantity, int priceBook, int totalPrice, String paymentMethod, int discPerc, int finalPrice) {
    System.out.printf("%-4d %-17s %-15s %-12d %-15s %-18s %-15s %-15s\n", no, bookName, formatCurrency(priceBook), quantity, formatCurrency(totalPrice), discPerc + "%", formatCurrency(finalPrice), paymentMethod);
  }
}
