package task;

import java.text.NumberFormat;
import java.util.Locale;
import task.interfc.Discount;

public class Payment extends PlaceOrder implements Discount{
  private String paymentMethod;
  private final int discPerc = 10;

  public Payment(String customerName, String bookName, int quantity, int priceBook, String paymentMethod) {
    super(customerName, bookName, quantity, priceBook);
    this.paymentMethod = paymentMethod;
  }

  public int calculateDiscount(){
    int discountAmount = (calculateTotalPrice() * discPerc) / 100;
    return calculateTotalPrice() - discountAmount;
  }
  
  public static String formatCurrency(int price) {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    return currencyFormat.format(price);
  }
  
  public void displayOrderDetails() {
    super.displayOrderDetails(); 
    System.out.println("\nPayment Method: " + paymentMethod);
    System.out.println("Processing payment...");
    System.out.println("\nDiscount: " + discPerc + "%");
    System.out.println("Payment Amount: " + formatCurrency(calculateDiscount()));
    System.out.println("Payment Successful using " + paymentMethod);
  }
}
