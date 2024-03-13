package Leehd;
public class Leehd {
    public static void main(String[] args) {
        // 아래 배열중에 짝수만 출력
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count = count + 1;
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
