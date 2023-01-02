package SilSup;

public class Won2Dollar extends Converter {

  public Won2Dollar(int rate) {
    ratio = rate;
  }

  protected String getSrcString() {
    return "원";
  }

  protected String getDestString() {
    return "달러";
  }

  protected double convert(double src) {
    return src / ratio;
  }

  public static void main(String args[]) {
    Won2Dollar toDollar = new Won2Dollar(1200);
    // 1달러는 1200원
    toDollar.run();
  }
}
