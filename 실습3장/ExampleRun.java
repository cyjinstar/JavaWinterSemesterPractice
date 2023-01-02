public class ExampleRun extends SamsungPhone {

  public static void main(String[] args) {
    SamsungPhone phone = new SamsungPhone();
    phone.printLogo();
    phone.sendCall();
    phone.play();
    System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
    phone.schedule();
  }
}
