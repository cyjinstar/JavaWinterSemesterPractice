interface PhoneInterface { // 인터페이스 선언
  final int TIMEOUT = 10000; // 상수 필드 선언
  void sendCall(); // 추상 메소드
  void receiveCall(); // 추상 메소드

  default void printLogo() { // default 메소드
    System.out.println("** Phone **");
  }
}

interface MobilePhoneInterface extends PhoneInterface {
  void sendSMS();
  void receiveSMS();
}

interface MP3Interface { // 인터페이스 선언
  void play();

  void stop();
}

class PDA { // 클래스 작성

  int calculate(int x, int y) {
    return x + y;
  }
}

public class SamsungPhone
  extends PDA
  implements MobilePhoneInterface, MP3Interface {

  public void sendCall() {
    System.out.println("떼레레랭");
  }

  public void receiveCall() {
    System.out.println("전화가 왔습니다.");
  }

  public void flash() {
    System.out.println("전화기에 불이 켜졌습니다.");
  }

  public void sendSMS() {
    System.out.println("문자갑니다.");
  }

  public void receiveSMS() {
    System.out.println("문자왔어요.");
  }

  public void play() {
    System.out.println("음악 연주합니다.");
  }

  public void stop() {
    System.out.println("음악 중단합니다.");
  }

  // 추가로 작성한 메소드
  public void schedule() {
    System.out.println("일정 관리합니다.");
  }
}
