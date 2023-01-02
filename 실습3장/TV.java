public class TV {

  public String brand;
  public int year;
  public int inch;

  public TV(String s, int y, int i) {
    brand = s;
    year = y;
    inch = i;
  }

  public void show() {
    System.out.println(
      brand + "에서 만든 " + year + "년형 " + inch + "인치 TV"
    );
  }

  public static void main(String[] args) {
    TV myTV = new TV("LG", 2017, 32);
    myTV.show();
  }
}
