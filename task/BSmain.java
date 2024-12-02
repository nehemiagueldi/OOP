package task;

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

    System.out.println("\nBook List:");
    System.out.println("---------------------------------------------------------");
    System.out.printf("%-4s %-17s %-8s %-15s %-10s\n", "No", "Book Name", "Year", "Price", "Stock");
    System.out.println("---------------------------------------------------------");
    book1.displayBooks(1);
    book2.displayBooks(2);
    book3.displayBooks(3);

    PlaceOrder order = new PlaceOrder("John Doe", "Laskar Pelangi", 2, 50000);
    order.displayOrderDetails();

    System.out.println("\n----- Invoice Details -----");
    Invoice invoice = new Invoice("John Doe", "Laskar Pelangi", 2, 50000);
    invoice.displayOrderDetails();

    System.out.println("\n----- Payment Details -----");
    Payment payment = new Payment("John Doe", "Laskar Pelangi", 2, 50000, "Virtual Account");
    payment.displayOrderDetails();
    
  }
}
