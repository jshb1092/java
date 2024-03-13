package Leehd3;
public class Leehd3 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};
        //2 3 4 5 1
        //3 4 5 1 2
        //4 5 1 2 3
        //5 1 2 3 4

        int n = 3;//n 횟수만큼 값을 왼쪽으로 움직인다.

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, first;//for문을 나와서 int값 유지하기 위함

            first = arr[0];  // 포인트 1
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];//현재의 인덱스의 1을 더 가고 있다
            }
            arr[j] = first;  // 포인트 2
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}