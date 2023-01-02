package SilSup;

import java.util.Arrays;
import java.util.Scanner;

class Histrogram {

  public String draw(String s) {
    switch (s) {
      case "a":
      case "A":
        return "----------------";
      case "b":
      case "B":
        return "----";
      case "c":
      case "C":
        return "---";
      case "d":
      case "D":
        return "--------";
      case "e":
      case "E":
        return "---------------------------------------------";
      case "f":
      case "F":
        return "---";
      case "g":
      case "G":
        return "--------";
      case "h":
      case "H":
        return "--------------";
      case "i":
      case "I":
        return "------------------------------------";
      case "j":
      case "J":
        return "";
      case "k":
      case "K":
        return "--";
      case "l":
      case "L":
        return "----------------";
      case "m":
      case "M":
        return "--------------------";
      case "n":
      case "N":
        return "-----------------------";
      case "o":
      case "O":
        return "----------------------------------------";
      case "p":
      case "P":
        return "--";
      case "q":
      case "Q":
        return "";
      case "r":
      case "R":
        return "---------------------------";
      case "s":
      case "S":
        return "------------------";
      case "t":
      case "T":
        return "---------------------------------------------";
      case "u":
      case "U":
        return "------";
      case "v":
      case "V":
        return "------";
      case "w":
      case "W":
        return "-----------------";
      case "x":
      case "X":
        return "";
      case "y":
      case "Y":
        return "---------";
      case "z":
      case "Z":
        return "";
      default:
        return "";
    }
  }
}

public class AlphabetHistogram {

  public static void main(String[] args) {
    System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
    String[] input = new String[0];
    Histrogram histrogram = new Histrogram();
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String[] tokens = scanner.nextLine().split("");
      if (tokens[tokens.length - 1].equals(";")) {
        break;
      }
      int tempInputLen = input.length;
      input = Arrays.copyOf(input, input.length + tokens.length);
      for (int i = 0; i < tokens.length; i++) {
        input[tempInputLen + i] = tokens[i];
      }
    }
    System.out.println("히스토그램을 그립니다.");
    for (int i = 0; i < input.length; i++) {
      System.out.println(histrogram.draw(input[i]));
    }

    scanner.close();
  }
}
