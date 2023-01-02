class Rectangle {

  int x;
  int y;
  int width;
  int hight;

  public Rectangle(int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.width = w;
    this.hight = h;
  }

  public int square() {
    return this.width * this.hight;
  }

  public void show() {
    System.out.println(
      "(" +
      this.x +
      "," +
      this.y +
      ")에서 크기가 " +
      width +
      "x" +
      hight +
      "인 사각형"
    );
  }

  public boolean contains(Rectangle r) {
    boolean isContains = false;
    if (this.x < r.x || this.x + this.width > r.x + r.width) {
      if (this.y < r.y || this.y + this.hight > r.y + r.hight) {
        isContains = true;
      }
    }
    return isContains;
  }
}

public class v {

  public static void main(String[] args) {
    Rectangle r = new Rectangle(2, 2, 8, 7);
    Rectangle s = new Rectangle(5, 5, 6, 6);
    Rectangle t = new Rectangle(1, 1, 10, 10);

    r.show();
    System.out.println("s의 면적은 " + s.square());
    if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
    if (t.contains(s)) System.out.println("t는 s을 포함합니다.");
  }
}
