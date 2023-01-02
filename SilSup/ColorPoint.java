package SilSup;

public class ColorPoint extends Point {

  protected String color;

  ColorPoint(int x, int y, String color) {
    super(x, y);
    this.color = color;
  }

  protected void setXY(int x, int y) {
    super.move(x, y);
  }

  protected void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    String s;

    s =
      color +
      "색의 (" +
      Integer.toString(getX()) +
      "," +
      Integer.toString(getY()) +
      ")의 점";

    return s;
  }

  public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
    cp.setXY(10, 20);
    cp.setColor("RED");
    String str = cp.toString();
    System.out.println(str + "입니다. ");
  }
}
