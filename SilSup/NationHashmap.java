package SilSup;

import java.util.*;

public class NationHashmap {

  public static void main(String[] args) {
    HashMap<String, String> NationPopulation = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
    while (true) {
      System.out.print("나라 이름, 인구 >> ");
      String inputValue = s.nextLine();
      if (inputValue.equals("그만")) break;
      StringTokenizer st = new StringTokenizer(inputValue);
      NationPopulation.put(st.nextToken(), st.nextToken());
    }
    while (true) {
      System.out.print("인구검색 >> ");
      String serachCountry = s.nextLine();
      String valueOfSearchCountry = NationPopulation.get(serachCountry);
      if (serachCountry.equals("그만")) break;
      if (NationPopulation.containsKey(serachCountry)) {
        System.out.println(serachCountry + "의 인구는 " + valueOfSearchCountry);
      } else {
        System.out.println(serachCountry + " 나라는 없습니다.");
      }
    }
    s.close();
  }
}
