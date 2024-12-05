package day3;

public class CacheAny <T> {
  private T t;

  public CacheAny(T t) {
    super();
    this.t = t;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }
}
