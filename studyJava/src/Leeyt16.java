import java.util.Random;

public class Leeyt16 {
    public static void main(String[] args) {
        //난수생성법,Random 숫자 만드는법
    //    Random rd = new Random();
    //    int randNum = rd.nextInt(10)+1;//0 부터 입력한 정수값 -1 범위에서 랜덤
    //    System.out.println(randNum);

        //9.1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오.
        //단,중복 숫자는 허용하지 않음!!
        int[] numberlist1 ={1,2,3,4,5,6};
        int[] numberlist2 ={0,1,2};
        for (int i=0;i<numberlist1.length;i++){
           numberlist1[i]=numberlist1[i]-1;
           for(int j=0;j<numberlist2.length;j++){
               numberlist2[j]=numberlist2[j]+1;
           }
        }
        Random rd = new Random();
        int randNum = rd.nextInt(45)+1;
        System.out.println(randNum);
    }
}
