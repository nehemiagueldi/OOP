package task.utils;

public class DiscountUtils {
  public static int calculateDiscount(int totalPrice, int discountPercentage) {
    int discountAmount = (totalPrice * discountPercentage) / 100;
    return totalPrice - discountAmount;
  }
}
