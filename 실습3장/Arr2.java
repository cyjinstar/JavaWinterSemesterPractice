import java.util.Scanner;

public class Arr2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 몇 개?");
    int arrSize = scanner.nextInt();
    scanner.close();

    int[] intArr = new int[arrSize];
    for (int count = 0; count < arrSize; count++) {
      intArr[count] = (int) (Math.random() * 100 + 1);
      for (int searchCount = 0; searchCount < count; searchCount++) {
        if (intArr[searchCount] == intArr[count]) {
          count--;
        }
      }
      System.out.print(intArr[count] + " ");
    }
  }
}
