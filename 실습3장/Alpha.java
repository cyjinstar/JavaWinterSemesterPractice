import java.util.Scanner;

public class Alpha {

  public static void main(String[] args) {
    System.out.print("소문자 알파벳 한 글자를 입력하시오 >>");
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    char c = s.charAt(0);
    char tempC = c;
    scanner.close();
    do {
      System.out.print(c);
      c = (char) (c - 1);
      if (c == '`') {
        System.out.print("\n");
        c = (char) (tempC - 1);
        tempC--;
      }
    } while (c != '`');
  }
}
