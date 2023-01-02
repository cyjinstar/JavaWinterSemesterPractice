package SilSup;

class TV {

  private int size;

  public TV(int size) {
    this.size = size;
  }

  protected int getSize() {
    return size;
  }
}

public class ColorTV extends TV {

  private int color;

  public ColorTV(int size, int c) {
    super(size);
    this.color = c;
  }

  public void printProperty() {
    System.out.println(this.getSize() + "인치 " + this.color + " Color TV");
  }

  public static void main(String[] args) {
    ColorTV myTV = new ColorTV(32, 1024);
    myTV.printProperty();
  }
}
