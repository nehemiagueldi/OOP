package task;

import task.utils.PlaceOrderUtils;

public class BSmain {
  public static void main(String[] args) {
    Book book1 = new Book();
    book1.setId("B-001");
    book1.setName("Negeri 5 Menara");
    book1.setYear(1967);
    book1.setPrice(10000);
    book1.setStock(50);
    
    Book book2 = new Book("Bumi Manusia", 2000, 35000, 30);
    Book book3 = new Book("Laskar Pelangi", 2006, 50000, 50);

    System.out.println("\n----- Book List -----");
    System.out.println("---------------------------------------------------------");
    System.out.printf("%-4s %-17s %-8s %-15s %-10s\n", "No", "Book Name", "Year", "Price", "Stock");
    System.out.println("---------------------------------------------------------");
    book1.displayBooks(1);
    book2.displayBooks(2);
    book3.displayBooks(3);

    String invoiceId = PlaceOrderUtils.generateId("Invoice");
    String paymentId = PlaceOrderUtils.generateId("Payment");

    Invoice invoice1 = new Invoice(invoiceId, "Laskar Pelangi", 2, book3.getPrice());
    Invoice invoice2 = new Invoice(invoiceId, "Bumi Manusia", 3, book2.getPrice());
    System.out.println("\n----- Invoice Details -----");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    System.out.printf("%-4s %-17s %-15s %-12s %-15s %-18s %-15s\n", "No", "Book Name", "Price", "Quantity", "Total Price", "Invoice Created", "Invoice Expired");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    invoice1.displayInvoiceDetails(1, invoice1.bookName, invoice1.quantity, invoice1.priceBook, invoice1.calculateTotalPrice(), invoice1.invoiceDateCreated, invoice1.invoiceDateExpired);;
    invoice2.displayInvoiceDetails(2, invoice2.bookName, invoice2.quantity, invoice2.priceBook, invoice2.calculateTotalPrice(), invoice2.invoiceDateCreated, invoice2.invoiceDateExpired);

    Payment payment = new Payment();
    Payment payment1 = new Payment(paymentId, "Laskar Pelangi", 2, book3.getPrice(), "Virtual Account");
    Payment payment2 = new Payment(paymentId, "Bumi Manusia", 3, book2.getPrice(), "Virtual Account");
    System.out.println("\n----- Payment Details -----");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.printf("%-4s %-17s %-15s %-12s %-15s %-18s %-15s %-15s\n", "No", "Book Name", "Price", "Quantity", "Total Price", "Discount", "Final Price", "Payment Method");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    payment1.displayPaymentDetails(1);
    payment2.displayPaymentDetails(2);

    int totalBooksPurchasedPrice = payment.calculateTotalPrice(payment1.calculateTotalPrice(), payment2.calculateTotalPrice());
    int grandTotalPrice = payment.calculateTotalPrice(totalBooksPurchasedPrice);

    payment.displayGrandTotal(totalBooksPurchasedPrice, grandTotalPrice);
  }
}
