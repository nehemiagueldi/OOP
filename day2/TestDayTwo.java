package day2;

public class TestDayTwo {
  public static void main(String[] args) {

    Triangle triangle = new Triangle(2f, 5f, 12f);
    triangle.result("Triangle", "Volume");

    Circle circle = new Circle(5f);
    circle.result("Circle", "Volume");
    
    Square square = new Square();
    square.setSide(5f);

    System.out.println("\nNilai yang diinputkan: " + square.getSide());

    System.out.println("Hasil: " + square.area());
    // square.result("Square", "Volume");
  }
}
