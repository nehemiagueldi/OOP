package day2;

import day2.repository.CircleInterface;

public class Circle extends Shape implements CircleInterface {
  public Circle(String name, float r) {
    super(name);
    this.r = r;
  }

  public Circle(float r) {
    this.r = r;
  }

  private final float phi = 3.14f;
  private float r;

  public float area () {
    return phi * r * r;
  }

  public float around () {
    return 2 * phi * r;
  }

  @Override
  public float volume() {
    return 0f;
  }

  // method untuk menghitung luas, keliling, volume lingkaran
  public float process(String type, Float r){
    if (type.equalsIgnoreCase("area")) {
      return phi * r * r;
    } else if (type.equalsIgnoreCase("around")) {
      return 2 * phi * r;
    } else {
      return 0.75f * phi * (r * r * r);
    }
  }

  public void result(String name, String type){
    super.result(name, type);
    System.out.println(process(type, r));
  }
}
