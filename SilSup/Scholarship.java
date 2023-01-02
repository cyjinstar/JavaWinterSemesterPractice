package SilSup;

import java.util.*;

public class Scholarship {

  public static void main(String[] args) {
    HashMap<String, Double> ScholarshipMap = new HashMap<>();
    Scanner s = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("이름과 학점 >> ");
      String inputString = s.nextLine();
      StringTokenizer st = new StringTokenizer(inputString);
      ScholarshipMap.put(st.nextToken(), Double.valueOf(st.nextToken()));
    }
    System.out.print("장학생 선발 학점 기준 입력 >> ");
    Double scholarshipStandard = s.nextDouble();
    Set<String> names = ScholarshipMap.keySet();
    Iterator<String> itNames = names.iterator();
    System.out.print("장학생 명단 : ");
    while (itNames.hasNext()) {
      String name = itNames.next();
      if (ScholarshipMap.get(name) > scholarshipStandard) {
        System.out.print(name + " ");
      }
    }
    s.close();
  }
}
