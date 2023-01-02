import java.util.Scanner;

public class Grade {

  int mathGrade;
  int sciGrade;
  int engGrade;

  public Grade(int mg, int sg, int eg) {
    mathGrade = mg;
    sciGrade = sg;
    engGrade = eg;
  }

  public int average() {
    return (mathGrade + sciGrade + engGrade) / 3;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
    int math = scanner.nextInt();
    int sci = scanner.nextInt();
    int eng = scanner.nextInt();
    Grade me = new Grade(math, sci, eng);
    System.out.println("평균은 " + me.average() + " 입니다.");
    scanner.close();
  }
}
