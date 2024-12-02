package day2;

public abstract class Shape {
  String name;
  /*
   * bukan inheritance
   */
  public abstract float area();
  public abstract float around();
  /*
   * bukan inheritance
   */

  public Shape() {
    super();
  }

  public Shape(String name) {
    this.name = name;
  }

  public void displayShape(String name, String type, float area) {
    System.out.println("Hasil " + type + " dari " + name + ": " + area);
  }

  /*
   * inheritance karena methodnya dipakai untuk child
   */
  public void result(String name, String type) {
    System.out.println("\nProcess for " + type + " " + name);
  }
}
