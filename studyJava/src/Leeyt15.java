import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Leeyt15 {
    public static void main(String[] args) {
        //6.아래 배열에서 입력 받은 값보다 큰 수만 출력하시오
   //     int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
    //    Scanner scan = new Scanner(System.in);
    //    System.out.print("0~10까지 슷자를 입력해주세요 : ");
    //
    //    for(int i=0;i<intList1.length;i++){
    //        if(intList1[i]>num){
    //            System.out.print(intList1[i]+" ");
        //새로운 배열에 담기
   //    int[] intList2 = new int[intList1.length];
    //    int count = 0;
    //    for(int i=0; i<intList1.length;i++){
    //        if(intList1[i]> num){
    //            intList2[count] = intList1[i];//intList2[i]대신 사용가능
    //            count = count + 1;
        //새로운 배열에 담기 : ArrayList 사용하기
    //    ArrayList<Integer>intList3 =new ArrayList<Integer>();
    //    for(int i=0;i< intList1.length;i++){
    //        if (intList1[i] > num){
    //            intList3.add(intList1[i]);
    //        }
    //    }
    //    System.out.println(intList3.toString());
        //7.아래 배열의 총합과 평균을 출력하시오
        //int[] numberList = {12,34,56,32,84,99,73,69};
        //int sum = 0;
        //for(int i=0;i<numberList.length;i++){ //총합
        //    sum = sum + numberList[i];
        //}
        //int average = sum / numberList.length;//평균
        //System.out.println(sum + " "+average);
        //8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
            Scanner sc = new Scanner(System.in);
            System.out.print("이름을 입력해주세요 : ");
            String inputstr = sc.nextLine();
            System.out.println(inputstr);
            char[] charList1 = inputstr.toCharArray();//입력받은 문자열을 char 배열을 담음
            char[] charList2 = new char[charList1.length];// 거꾸로 저장할 새로운 배열을 만듬
            int index = charList2.length -1;// 새로운 배열의 위치를 나타내는 변수
            for (int i=0; i<charList1.length; i++){
                charList2[index] = charList1[i];
                index = index - 1;
            }
            //배열형태로 출력
            System.out.println(Arrays.toString(charList2));
            //문자열로 출력하기 위해 반복문 사용
        for(int i=0;i<charList2.length;i++){
            System.out.print(charList2[i]);
        }
        System.out.println();
    }
}
