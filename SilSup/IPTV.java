package SilSup;

public class IPTV extends ColorTV {

  private String ip;
  private int color;

  public IPTV(String ip, int size, int c) {
    super(size, c);
    this.ip = ip;
    this.color = c;
  }

  public void printProperty() {
    System.out.println(
      ip + " 주소의 " + this.getSize() + "인치, " + color + "컬러 IPTV"
    );
  }

  public static void main(String[] args) {
    IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
    iptv.printProperty();
  }
}
