package task.utils;

public class PlaceOrderUtils {
  public static String generateId(String type) {
    int randomNumber = 100 + (int)(Math.random() * 900); 
    if (type.equalsIgnoreCase("invoice")) {
      return "INV-" + randomNumber;
    } else if (type.equalsIgnoreCase("payment")) {
      return "PAY-" + randomNumber;
    } else {
      return "ORD-" + randomNumber;
    }
  }
}
