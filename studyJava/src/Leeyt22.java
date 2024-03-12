import java.util.Arrays;

public class Leeyt22 {
     //복작도 : 그 코드의 얼마만의 시간이 걸리는가
     public static void main(String[] args) {
         int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
         int[] fr = new int[arr.length];//처음에는 0이 들어있다
         int visited = -1;//배열의 0의 양의 정수다
         for (int i = 0; i < arr.length; i++) {
             int count = 1;//해당숫자의 같은값찾기
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[i] == arr[j]) {
                     count++;// 같은값이 있다면 count는 증가한다
                     fr[j] = visited;//해당 같은값이있으면 fr값은 바뀐다
                     break;
                 }
             }
             if (fr[i] != visited)
                 fr[i] = count;//오른쪽 같은값 개수 세어도 visited가 -1이기때문에 세지않고 넘어감
             System.out.println(Arrays.toString(fr));
         }
         for (int i = 0; i < fr.length; i++) {
             if (fr[i] != visited)
                 System.out.println("    " + arr[i] + "    |    " + fr[i]);
         }
     }
 }
