package day2;

public class Triangle extends Shape {
  // CONSTRUCTOR 
  public Triangle() {
    super();
  }

  public Triangle(String name, float base, float height) {
    super(name);
    this.base = base;
    this.height = height;
  }

  public Triangle(String name, float side) {
    super(name);
    this.side = side;
  }

  /*
   * this untuk menandakan bahwa variable tersebut adalah milik class Triangle bukan dari variable parameter
   * constructor boleh namanya sama tapi harus beda tipe data variable parameternya
   * kalau tidak ingin menggunakan this boleh, tapi nama local variablenya harus beda dengan variable parameter
   */

  public Triangle(float base, float height) {
    this.base = base;
    this.height = height;
  }

  public Triangle(float side) {
    this.side = side;
  }

  public Triangle(float base, float height, float prismHeight) {
    this.base = base;
    this.height = height;
    this.prismHeight = prismHeight;
  }

  // ATRIBUT
  public float base, height, side, prismHeight;

  // method untuk menghitung luas segitiga
  public float area() {
    return 0.5f * base * height;
  }

  // method untuk menghitung keliling segitiga
  public float around(){
    return 3 * side;
  }

  // method untuk menghitung volume prisma
  public float process(float base, float height, float prismHeight){
    return ((base * height) / 2) * prismHeight;
  }

  public void result(String name, String type) {
    super.result(name, type);
    if(type.equalsIgnoreCase("area")) {
      System.out.println(area());
    } else if (type.equalsIgnoreCase("around")) {
      System.out.println(around());
    } else {
      System.out.println(process(base, height, prismHeight));
    }
  }

}
