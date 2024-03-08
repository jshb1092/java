import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Leeyt16 {
    public static void main(String[] args) {
        //난수생성법,Random 숫자 만드는법
    //    Random rd = new Random();
    //    int randNum = rd.nextInt(10)+1;//0 부터 입력한 정수값 -1 범위에서 랜덤
    //    System.out.println(randNum);

        //9.1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오.
        //단,중복 숫자는 허용하지 않음!!
        Random randClass = new Random();
        int[] rottoList = new int[6];

//        for (int i=0; i<rottoList.length; i++) {
//            int temp = randClass.nextInt(45) + 1;
//            for (int j=0; j<i; j++) {
//                if (rottoList[j] == temp) {
//                    temp = randClass.nextInt(45) + 1;
//                    j = -1;
//                }
//            }
//            rottoList[i] = temp;
//        }
//        System.out.println(Arrays.toString(rottoList));

        for (int i=0; i<rottoList.length; i++) {
            rottoList[i] = randClass.nextInt(45) + 1;
            for (int j=0; j<i; j++) {
                if (rottoList[j] == rottoList[i]) {
                    i = i - 1;
                }
            }
        }
        System.out.println(Arrays.toString(rottoList));
    }
}