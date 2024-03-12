import java.util.Arrays;

public class Leeyt21 {
    public static void main(String[] args) {
        //아래 배열의 모든값들을 다른배열에 복사하기
        int[] intArray1 = {1, 2, 3, 4, 5};
        int[] intArray2 = new int[intArray1.length];
        int count = 1;
        for (int i = 0; i < intArray1.length; i++) {
            intArray2[i] = intArray1[i];
        }
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
    }
}

