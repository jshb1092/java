import java.util.Arrays;

public class Leeyt10 {
    public static void main(String[] args) {
        //1. 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intList1 = new int[10];
        for (int i = 0; i < 10; i++) {
            intList1[i] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));
    }
}

