package task;

import task.interfc.PaymentInterface;
import task.utils.DiscountUtils;

public class Payment extends PlaceOrder<String> implements PaymentInterface{
  String bookName;
  int quantity;
  int priceBook;
  String paymentMethod;
  final int discPerc = 10;

  public Payment() {
    super();
  }

  public Payment(String paymentId, String bookName, int quantity, int priceBook, String paymentMethod) {
    super(paymentId);
    this.bookName = bookName;
    this.quantity = quantity;
    this.priceBook = priceBook;
    this.paymentMethod = paymentMethod;
  }

  public int calculateTotalPrice() {
    return quantity * priceBook;
  }

  public int calculateTotalPrice(int payment1, int payment2) {
    return payment1 + payment2;
  }

  public int calculateTotalPrice(int totalBooksPurchasedPrice) {
    return DiscountUtils.calculateDiscount(totalBooksPurchasedPrice, discPerc);
  }

  public int calculateGrandTotalPrice() {
    return 0;
  }

  public void displayGrandTotal(int totalBooksPurchasedPrice, int grandTotalPrice) {
    System.out.println("\n----- Grand Total -----");
    System.out.println("Total Price Before Discount: " + formatCurrency(totalBooksPurchasedPrice));
    System.out.println("Grand Total Price After Discount: " + formatCurrency(grandTotalPrice));
  }
  
  // public void displayPaymentDetails(int no) {
  //   int totalPrice = calculateTotalPrice();
  //   int finalPrice = DiscountUtils.calculateDiscount(totalPrice, discPerc);
  //   super.displayPaymentDetails(no, bookName, quantity, priceBook, totalPrice, paymentMethod, discPerc, finalPrice);
  // }
}
