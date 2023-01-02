package SilSup;

import java.util.*;

public class VectorEx {

  public static void main(String[] args) {
    System.out.print("정수(-1이 입력될 때 까지) >> ");
    Vector<Integer> v = new Vector<Integer>();
    Scanner s = new Scanner(System.in);
    while (s.hasNext()) {
      int intvec = Integer.valueOf(s.next());
      if (intvec == -1) {
        break;
      }
      v.add(intvec);
    }
    s.close();

    Iterator<Integer> iterator = v.iterator();
    int max = 0;
    while (iterator.hasNext()) {
      int n = iterator.next();
      if (n > max) {
        max = n;
      }
      System.out.print(n + " ");
    }
    System.out.println("\n 가장 큰 수는 " + max);
  }
}
