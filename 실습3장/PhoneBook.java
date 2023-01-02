import java.util.Scanner;

class Phone {

  String name;
  String tel;

  Phone(String n, String t) {
    this.name = n;
    this.tel = t;
  }
}

public class PhoneBook {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("인원수 >> ");
    int population = s.nextInt();
    s.nextLine();
    Phone[] p = new Phone[population];
    Boolean isEnd = false;
    for (int i = 0; i < population; i++) {
      String[] str;
      System.out.print("이름과 전화번호 입력 >> ");
      str = s.nextLine().split(" ");
      p[i] = new Phone(str[0], str[1]);
    }
    do {
      System.out.print("검색할 이름>> ");
      Boolean searchSuccess = false;
      String searchName = s.nextLine();
      if (searchName.equals("그만")) {
        isEnd = true;
        break;
      }
      for (int sc = 0; sc < p.length; sc++) {
        if (searchName.equals(p[sc].name)) {
          System.out.println(
            p[sc].name + "의 전화번호는 " + p[sc].tel + "입니다."
          );
          searchSuccess = true;
        }
      }
      if (searchSuccess == false) {
        System.out.println(searchName + "이 없습니다.");
      }
    } while (isEnd == false);
    s.close();
  }
}
