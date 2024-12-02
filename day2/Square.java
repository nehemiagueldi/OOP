package day2;

public class Square extends Shape{
  public Square() {
    super();
  }

  public Square(String name, float side) {
    super(name);
    this.side = side;
  }

  public Square(float side) {
    this.side = side;
  }

  private float side;

  public float getSide() {
    return side;
  }

  public void setSide(float side) {
    this.side = side;
  }

  @Override
  public String toString() {
    return "Square [side=" + side + "]";
  }

  public float area () {
    return side * side;
  }

  public float around () {
    return 4 * side;
  }

  // method untuk menghitung luas, keliling, volume persegi
  public float process(String type, float side){
    if (type.equalsIgnoreCase("area")) {
      return side * side;
    } else if (type.equalsIgnoreCase("around")) {
      return 4 * side;
    } else {
      return side * side * side;
    }
  }

  public void result(String name, String type){
    super.result(name, type);
    System.out.println(process(type, side));
  }
}
