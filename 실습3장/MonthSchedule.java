import java.util.Scanner;

class Day {

  private String work; // 하루의 할 일을 나타내는 문자열

  public void set(String work) {
    this.work = work;
  }

  public String get() {
    return work;
  }

  public void show() {
    if (work == null) System.out.println("없습니다."); else System.out.println(
      work + "입니다."
    );
  }
}

public class MonthSchedule {

  public static void main(String[] args) {
    Day[] d;
    d = new Day[30];
    int date = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("이번달 스케줄 관리 프로그램.");
    boolean isWorking = true;
    do {
      System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
      int userInput = s.nextInt();
      switch (userInput) {
        case 1:
          System.out.print("날짜(1~30)? ");
          date = s.nextInt();
          s.nextLine();
          System.out.print("할일(빈칸없이입력)? ");
          d[date] = new Day();
          String todo = s.nextLine();
          d[date].set(todo);
          break;
        case 2:
          System.out.print("날짜(1~30)? ");
          date = s.nextInt();
          System.out.println(
            date + "일의 할 일은 " + d[date].get() + " 입니다."
          );
          break;
        case 3:
          System.out.println("프로그램을 종료합니다.");
          isWorking = false;
          break;
      }
    } while (isWorking);
    s.close();
  }
}
