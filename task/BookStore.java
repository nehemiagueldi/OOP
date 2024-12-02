package task;

import java.text.NumberFormat;
import java.util.Locale;

public class BookStore {
  private Book[] books;
  private int bookCount;

  public BookStore() {
    books = new Book[20];
    bookCount = 0;
  }

  public void addBook (Book book) {
    if (bookCount > books.length) {
      System.out.println("Books collection is full!");
    } else {
      books[bookCount++] = book;
    }
  }

  public void viewBooks () {
    System.out.println("\nBook List:");
    System.out.println("---------------------------------------------------------");
    System.out.printf("%-4s %-17s %-8s %-15s %-10s\n", "No", "Book Name", "Year", "Price", "Stock");
    System.out.println("---------------------------------------------------------");
    for (int i = 0; i < bookCount; i++) {
      Book book = books[i];
      String name = book.getName();
      int year = book.getYear();
      String price = formatCurrency(book.getPrice());
      int stock = book.getStock();
      System.out.printf("%-4d %-17s %-8s %-15s %-10s\n", (i + 1), name, year, price, stock);
    }
  }

  public static String formatCurrency(int price) {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    return currencyFormat.format(price);
  }
}
