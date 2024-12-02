package task;

import java.text.NumberFormat;
import java.util.Locale;

public class PlaceOrder {
  private String orderId;
  private String customerName;
  private String bookName;
  private int quantity;
  private int priceBook;

  public PlaceOrder(String customerName, String bookName, int quantity, int priceBook) {
    this.orderId = generateOrderId();
    this.customerName = customerName;
    this.bookName = bookName;
    this.quantity = quantity;
    this.priceBook = priceBook;
  }

  private String generateOrderId() {
    int randomNumber = 100 + (int)(Math.random() * 900); 
    return "ORD-" + randomNumber;
  }

  public int calculateTotalPrice() {
    return quantity * priceBook;
  }
  
  public static String formatCurrency(int price) {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    return currencyFormat.format(price);
  }

  public void displayOrderDetails() {
    System.out.println("\nOrder ID: " + orderId);
    System.out.println("Customer Name: " + customerName);
    System.out.println("Book Name: " + bookName);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price Book: " + formatCurrency(priceBook));
    System.out.println("Total Price: " + formatCurrency(calculateTotalPrice()));
  }
}
