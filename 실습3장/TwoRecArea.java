import java.util.*;

public class TwoRecArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        System.out.println("첫 번째 사각형의 왼쪽 모서리 (xl1, yl1)과 (xr1, yr1)을 입력하시오");
        int xl1 = scanner.nextInt();
        int yl1 = scanner.nextInt();
        int xr1 = scanner.nextInt();
        int yr1 = scanner.nextInt();

        System.out.println("두 번째 사각형의 왼쪽 모서리 (xl2, yl2)과 (xr2, yr2)을 입력하시오");
        int xl2 = scanner.nextInt();
        int yl2 = scanner.nextInt();
        int xr2 = scanner.nextInt();
        int yr2 = scanner.nextInt();

        boolean x = (xl1<xl2 && xl2<xr1)||(xl1<xr2 && xr2<xr1);
        boolean y = (yl1<yl2 && yl2<yr1)||(yl1<yr2 && yr2<yr1);

        if(x && y){
            int[] xArr = new int[4];
            int[] yArr = new int[4];
            xArr[0] = xl1;
            xArr[1] = xr1;
            xArr[2] = xl2;
            xArr[3] = xr2;

            yArr[0] = yl1;
            yArr[1] = yr1;
            yArr[2] = yl2;
            yArr[3] = yr2;

            Arrays.sort(xArr);
            Arrays.sort(yArr);

            int rx = xArr[2] - xArr[1];
            int ry = yArr[2] - yArr[1];

            answer = rx * ry;
        }else{
            System.out.print("두 사각형은 서로 겹치지 않습니다. \n 따라서");
        }

        System.out.println("두 사각형의 겹치는 영역의 넓이는 "+ answer+ "입니다.");

        scanner.close();
    }
}