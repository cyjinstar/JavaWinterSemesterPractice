package SilSup;

import java.util.Scanner;

interface Stack {
  int length(); // 현재 스택에 저장된 개수 리턴
  int capacity(); // 스택의 전체 저장 가능한 개수 리턴
  String pop(); // 스택의 톱(top)에 실수 저장
  boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

public class StringStack implements Stack {

  public int stackSize;
  public static int count;
  public String[] stackArr;

  public int length() {
    return count;
  }

  public int capacity() {
    return stackSize - count;
  }

  public boolean push(String val) {
    if (count >= stackSize) {
      --count;
      System.out.println("스택이 꽉 차서 푸시불가!");
      return false;
    } else {
      stackArr[count] = val;
      // System.out.println(val);
      return true;
    }
  }

  public String pop() {
    count--;
    return stackArr[count];
  }

  public static void main(String[] args) {
    StringStack stringStack = new StringStack();
    stringStack.stackSize = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("총 스택 저장 공간의 크기 입력 >> ");
    stringStack.stackSize = s.nextInt();
    s.nextLine();
    stringStack.stackArr = new String[stringStack.stackSize];

    //여기 while(true) 해야함
    while (true) {
      System.out.print("문자열 입력 >> ");
      String str = s.nextLine();
      if (str.equals("그만")) {
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        while (count > 0) {
          System.out.print(stringStack.pop() + " ");
        }
        break;
      } else {
        stringStack.push(str);
        count++;
      }
    }
    s.close();
  }
}
