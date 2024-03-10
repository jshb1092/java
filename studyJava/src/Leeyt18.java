import javax.swing.*;
import java.util.Scanner;

public class Leeyt18 {
    public static void main(String[] args) {
        //1.양의 정수 10개 입력 2. 배열에 담는다 3.3의배수만 출력
        int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);
        System.out.print("3의배수를 입력하세요 : ");
        int num = scan.nextInt();
        System.out.println();
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = scan.nextInt();
            if (i % 3 == 0) ;
            System.out.println("3의배수");
            continue;
        }
        System.out.println("numberList[i] = 3,6,9");
    }
}
