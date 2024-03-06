import java.util.Arrays;

public class Leeyt11 {
    //2. 길이가 10인 배열에 10부터 1까지 값을 역순으로 입력
    //int len = 배열.length;
    //for(int i=0;i<배열.length;i++){
    //배열[i] = len;
    //len = len - 1;
     public static void main(String[] args) {
        int [] intList2 = new int[10];
        int len = intList2.length;
        for (int i=0; i<intList2.length; i++){
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));
    }
}
//int x = 1
//int len = 배열.length;
//for(int i =0 i<length-1;i++){
//배열[i]=x
//x=x
