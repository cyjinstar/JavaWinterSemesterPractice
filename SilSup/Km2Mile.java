package SilSup;

public class Km2Mile extends Converter {

  public Km2Mile(Double rate) {
    ratio = rate;
  }

  protected String getSrcString() {
    return "킬로미터";
  }

  protected String getDestString() {
    return "마일";
  }

  protected double convert(double src) {
    return src / ratio;
  }

  public static void main(String args[]) {
    Km2Mile toMile = new Km2Mile(1.6);
    // 1마일은 1.6km
    toMile.run();
  }
}
