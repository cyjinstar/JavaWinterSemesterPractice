package SilSup;

public class PositivePoint extends Point {

  PositivePoint(int x, int y) {
    super(x, y);
    if (x < 0 || y < 0) {
      move(0, 0);
    }
  }

  protected void move(int x, int y) {
    if (x < 0 || y < 0) {} else {
      super.move(x, y);
    }
  }

  @Override
  public String toString() {
    String s;

    s =
      "(" +
      Integer.toString(getX()) +
      "," +
      Integer.toString(getY()) +
      ")의 점";

    return s;
  }

  public static void main(String[] args) {
    PositivePoint p = new PositivePoint(0, 0);
    p.move(10, 10);
    System.out.println(p.toString() + "입니다.");
    p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
    System.out.println(p.toString() + "입니다.");
    PositivePoint p2 = new PositivePoint(-10, -10);
    System.out.println(p2.toString() + "입니다.");
  }
}
