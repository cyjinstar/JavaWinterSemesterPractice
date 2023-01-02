package SilSup;

abstract class PairMap {

  protected String KeyArray[]; // key 들을 저장하는 배열
  protected String valueArray[]; // value 들을 저장하는 배열

  abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴

  abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정

  abstract String delete(String key); // key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴

  abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

public class Dictionary extends PairMap {

  private int putCount = 0;

  Dictionary(int count) {
    KeyArray = new String[count];
    valueArray = new String[count];
    for (int i = 0; i < count; i++) {
      KeyArray[i] = null;
      valueArray[i] = null;
    }
  }

  String get(String key) {
    for (int i = 0; i < KeyArray.length; i++) {
      if (KeyArray[i] != null) {
        if (KeyArray[i].equals(key)) {
          return valueArray[i];
        }
      }
    }
    return null;
  }

  void put(String key, String value) {
    boolean isKeyExist = false;
    for (int i = 0; i < KeyArray.length; i++) {
      if (KeyArray[i] != null) {
        if (KeyArray[i].equals(key)) {
          valueArray[i] = value;
          isKeyExist = true;
        }
      }
    }
    if (!isKeyExist) {
      KeyArray[putCount] = key;
      valueArray[putCount] = value;
    }
    putCount++;
  }

  String delete(String key) {
    String result = null;
    for (int i = 0; i < KeyArray.length; i++) {
      if (KeyArray[i] != null) {
        if (KeyArray[i].equals(key)) {
          result = KeyArray[i];
          KeyArray[i] = null;
          valueArray = null;
          putCount++;
        }
      }
    }
    return result;
  }

  int length() {
    return putCount;
  }

  public static void main(String[] args) {
    Dictionary dic = new Dictionary(10);
    dic.put("황기태", "자바");
    dic.put("이재문", "파이선");
    dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
    System.out.println("이재문의 값은 " + dic.get("이재문"));
    System.out.println("황기태의 값은 " + dic.get("황기태"));
    dic.delete("황기태"); // 황기태 아이템 삭제
    System.out.println("황기태의 값은 " + dic.get("황기태")); //삭제된 아이템 접근
  }
}
