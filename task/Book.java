package task;

import java.text.NumberFormat;
import java.util.Locale;

public class Book {
  private String id;
  private String name;
  private int year;
  private int price;
  private int stock;

  public Book() {
    super();
  }

  public Book(String name, int year, int price, int stock) {
    this.id = generateBookId();
    this.name = name;
    this.year = year;
    this.price = price;
    this.stock = stock;
  }

  private String generateBookId() {
    int randomNumber = 100 + (int)(Math.random() * 900); 
    return "B-" + randomNumber;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public int getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }

  public int processReduceStock (int quantity) {
    return stock -= quantity;
  }

  public void reduceStock (int quantity) {
    if (quantity > stock) {
      System.out.println("Note: Your order exceeded available stock. Only " + quantity +
      " books have been processed.");
    } else {
      processReduceStock(quantity);
    }
  }

  public static String formatCurrency(int price) {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    return currencyFormat.format(price);
  }

  public void displayBooks(int no) {
    System.out.printf("%-4s %-17s %-8s %-15s %-10s\n", no, name, year, formatCurrency(price), stock);
  }

  @Override
  public String toString() {
    return "Book [id=" + id + ", name=" + name + ", year=" + year + ", price=" + price + ", stock=" + stock + "]";
  }
}
