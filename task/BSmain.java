package task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import task.utils.DiscountUtils;
import task.utils.PlaceOrderUtils;

public class BSmain {
  public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>();
    // bookList.stream().filter(b -> b.getPrice() < 50000).forEach(x -> System.out.println(x));
    Book book1 = new Book();
    book1.setId("B-001");
    book1.setName("Negeri 5 Menara");
    book1.setYear(1967);
    book1.setPrice(10000);
    book1.setStock(50);
    bookList.add(book1);
    
    Book book2 = new Book("Bumi Manusia", 2000, 35000, 30);
    Book book3 = new Book("Laskar Pelangi", 2006, 50000, 50);

    bookList.add(book2);
    bookList.add(book3);

    System.out.println("\n----- Book List -----");
    System.out.println("---------------------------------------------------------");
    System.out.printf("%-4s %-17s %-8s %-15s %-10s\n", "No", "Book Name", "Year", "Price", "Stock");
    System.out.println("---------------------------------------------------------");
    for (int i = 0; i < bookList.size(); i++) {
      bookList.get(i).displayBooks(i + 1);
    }

    List<Book> selectedBook = bookList.stream()
                                      .filter(b -> b.getPrice() < 50000)
                                      .filter(b -> b.getStock() < 50)
                                      .collect(Collectors.toList());

    List<Book> sortedBook = bookList.stream()
                                    .sorted(Comparator.comparing(Book::getPrice).reversed())
                                    .collect(Collectors.toList());

    // bookList.forEach(b -> System.out.println(b));
    // selectedBook.forEach(b -> System.out.println(b));
    // selectedBook.forEach(System.out::println);
    sortedBook.forEach(System.out::println);
    // book1.displayBooks(1);
    // book2.displayBooks(2);
    // book3.displayBooks(3);

    int invoiceId = PlaceOrderUtils.generateIdInvoice();
    String paymentId = PlaceOrderUtils.generateId("Payment");

    List<Invoice> invoiceList = new ArrayList<>();

    Invoice invoice1 = new Invoice(invoiceId, "Laskar Pelangi", 2, book3.getPrice());
    Invoice invoice2 = new Invoice(invoiceId, "Bumi Manusia", 3, book2.getPrice());

    invoiceList.add(invoice1);
    invoiceList.add(invoice2);
    System.out.println("\n----- Invoice Details -----");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    System.out.printf("%-4s %-17s %-15s %-12s %-15s %-18s %-15s\n", "No", "Book Name", "Price", "Quantity", "Total Price", "Invoice Created", "Invoice Expired");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    for (int i = 0; i < invoiceList.size(); i++) {
      Invoice invoice = invoiceList.get(i);
      invoice.displayInvoiceDetails(i + 1, invoice.bookName, invoice.quantity, invoice.priceBook, invoice.calculateTotalPrice(), invoice.invoiceDateCreated, invoice.invoiceDateExpired);
    }
    // invoice1.displayInvoiceDetails(1, invoice1.bookName, invoice1.quantity, invoice1.priceBook, invoice1.calculateTotalPrice(), invoice1.invoiceDateCreated, invoice1.invoiceDateExpired);
    // invoice2.displayInvoiceDetails(2, invoice2.bookName, invoice2.quantity, invoice2.priceBook, invoice2.calculateTotalPrice(), invoice2.invoiceDateCreated, invoice2.invoiceDateExpired);

    List<Payment> paymentList = new ArrayList<>();
    int totalBooksPurchasedPrice = 0;
    Payment payment = new Payment();
    Payment payment1 = new Payment(paymentId, "Laskar Pelangi", 2, book3.getPrice(), "Virtual Account");
    Payment payment2 = new Payment(paymentId, "Bumi Manusia", 3, book2.getPrice(), "Virtual Account");

    paymentList.add(payment1);
    paymentList.add(payment2);
    System.out.println("\n----- Payment Details -----");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.printf("%-4s %-17s %-15s %-12s %-15s %-12s %-15s %-15s\n", "No", "Book Name", "Price", "Quantity", "Total Price", "Discount", "Final Price", "Payment Method");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    for (int i = 0; i < paymentList.size(); i++) {
      Payment ordPayment = paymentList.get(i);

      int totalPrice = ordPayment.calculateTotalPrice();
      totalBooksPurchasedPrice += totalPrice;

      ordPayment.displayPaymentDetails(i + 1, ordPayment.bookName, ordPayment.quantity, ordPayment.priceBook, totalPrice, ordPayment.paymentMethod, ordPayment.discPerc, DiscountUtils.calculateDiscount(totalPrice, ordPayment.discPerc));
    }
    // payment1.displayPaymentDetails(1, payment1.bookName, payment1.quantity, payment1.priceBook, payment1.calculateTotalPrice(), payment1.paymentMethod, payment1.discPerc, DiscountUtils.calculateDiscount(payment1.calculateTotalPrice(), payment1.discPerc));
    // payment2.displayPaymentDetails(2, payment2.bookName, payment2.quantity, payment2.priceBook, payment2.calculateTotalPrice(), payment2.paymentMethod, payment2.discPerc, DiscountUtils.calculateDiscount(payment2.calculateTotalPrice(), payment2.discPerc));
    // int totalBooksPurchasedPrice = payment.calculateTotalPrice(payment1.calculateTotalPrice(), payment2.calculateTotalPrice());

    int grandTotalPrice = payment.calculateTotalPrice(totalBooksPurchasedPrice);

    payment.displayGrandTotal(totalBooksPurchasedPrice, grandTotalPrice);
  }
}
