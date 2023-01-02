import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("금액을 입력하시오");
        int totalMoney = scanner.nextInt();

        int fiveMillionWon = totalMoney / 50000;
        int oneMillionWon = (totalMoney % 50000) / 10000;
        int oneThousandWon = (totalMoney % 50000 % 10000) / 1000;
        int fiveHunderedWon = ((totalMoney % 50000) % 10000 % 1000) / 500;
        int oneHunderedWon = ((totalMoney % 50000) % 10000 % 1000 % 500) / 100;
        int fiftyWon = ((totalMoney % 50000) % 10000 % 1000 % 500 % 100) / 50;
        int tenWon = ((totalMoney % 50000) % 10000 % 1000 % 500 % 100 % 50) / 10;
        int oneWon = ((totalMoney % 50000) % 10000 % 1000 % 500 % 100 % 50 % 10);

        System.out.println("오만원권"+ fiveMillionWon + "매");
        System.out.println("만원권"+ oneMillionWon + "매");
        System.out.println("천원권"+ oneThousandWon + "매");
        System.out.println("오백원"+ fiveHunderedWon + "개");
        System.out.println("백원"+ oneHunderedWon + "개");
        System.out.println("오십원"+ fiftyWon + "개");
        System.out.println("십원"+ tenWon + "개");
        System.out.println("일원"+ oneWon + "개");


        scanner.close();
    }
}
