import java.util.Arrays;
import java.util.Scanner;
public class Leeyt13 {
    public static void main(String[] args) {
        //자바에서 입력값을 받는 방법
    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("0~6까지 숫자를 입력해주세요 : ");
    //    int inputNumber = sc.nextInt();
    //    if (inputNumber >= 0 && inputNumber <=6) {
    //        System.out.println(inputNumber);
    //    }else {
    //        System.out.println("잘못 입력하셨습니다.");
    //    }

        //3.자바에서 문자열을 입력받는 방법
    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("이름을 입력해주세요 : ");
    //      String inputstr = sc.nextLine();
    //    System.out.println(inputstr);

        //4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
       char[] week ={'월','화','수','목','금','토','일'};
       Scanner scan = new Scanner(System.in);
       System.out.print("0~6까지 숫자를 입력하세요:");
       int num = scan.nextInt();
       for(int i=0;i<week.length;i++){
           if(num >= 0 && num <= 6){
               System.out.println(week[num]);
               break;
           }else{
               System.out.println("잘못 입력하셨습니다");
           }
       }

        // 5.사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "입력된이름"님 환영합니다를 출력하고
        // 없으면 "회원가입해주세요"를 출력함
        String[] members={"Steve","Tom","Michael","Laura","Jessica","Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputstr = scan2.nextLine();
        boolean found = false;
        for(int i=0;i<members.length;i++) {
            if (members[i].equalsIgnoreCase(inputstr)) { //.toLowercase() 생략
                System.out.println(members[i] + "님 환영합니다");//for문에 들어올 MAX값
                found = true;
                break;
            }
        }
        if(!found){//if(i == members.length - 1){ 대신 사용 가능
                System.out.print("회원가입해주세요");
        }
    }
}