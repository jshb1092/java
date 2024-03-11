import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class 예제 {
    public static void main(String[] args) {
        // 1. 길이가 30인 배열에 1부터 30까지 값을 입력
        /*int[] intList1 = new int[30];
        int i= 1;
        for(;i<30;i++){//int앞으로 내보냈을 경우 for문 초기식에서 세미콜론으로만 대체 가능함
            intList1[i] = i + 1;
        }
        System.out.println(intList1);
    }
}*/
        // 2. 아래 과일 배열에 "사과"와 "수박"이 몇개 들어있는지 확인
        /*String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == "사과") {
                count = count + 1;
            } else if (fruitList[i] == "수박") { // 만족하는 조건이 2개이상일 경우 else if문으로 추가함
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}*/
        // 3. 사용자로부터 0~5까지 숫자를 입력받아 아래 배열에 해당하는 날짜를 출력
        /*char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner scan = new Scanner(System.in);
        System.out.println("0~5까지 숫자를 입력하세요 : ");
        int num = scan.nextInt();
        for (int i = 0; i < week.length; i++) {
            if (num >= 0 && num <= 5){
                System.out.println(week[num]);
                break;
            }else{
                System.out.println("잘못 입력하셨습니다");
            }
        }
    }
}*/
        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력 (단, 대소문자 구분하지 마시오)
        /*String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputstr = scan2.nextLine();
        boolean found = false;//문자열 출력
        for (int i = 0; i < members.length; i++) {
            if (members[i].equalsIgnoreCase(inputstr.toLowerCase())) {
                System.out.println(members[i] + "환영합니다");
                break;
            }
            if (i == members.length - 1) {
                System.out.println("가입해주세요");
            }
        }
    }
}*/
        // 6. 아래 배열에서 입력받은 값보다 큰 수만 출력하시오
        /*int[] intList1 = {1, 5, 9, 13, 17, 23, 27, 31, 35, 39};
        Scanner scan = new Scanner(System.in);
        System.out.println("1부터 4씩 늘어난 값을 출력하시오 : ");
        int num = scan.nextInt();
        for (int i = 0; i < intList1.length; i++) {
            if (intList1[i] > num)
                System.out.println(intList1[i] + "");
        }
    }
}*/
        // 7. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // 예) hello 를 입력하면 olleh 를 출력
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("문자열을 입력해주세요 : ");
//        String inputStr = sc1.nextLine();

//        char[] charList1 = inputStr.toCharArray(); // 입력받은 문자열을 char 배열에 담음
//        char[] charList2 = new char[charList1.length]; // 거꾸로 저장할 새로운 배열을 만듬
//        int index = charList2.length - 1; // 새로운 배열의 위치를 나타내는 변수
//        for (int i=0; i< charList1.length; i++) {
//            charList2[index] = charList1[i];
//            index = index - 1;
//        }
//        // 배열형태로 출력
//        System.out.println(Arrays.toString(charList2));
//        // 문자열로 출력하기 위해 반복문 사용
//        for (int i=0; i< charList2.length; i++) {
//            System.out.print(charList2[i]);
//        }
//        System.out.println();
        // 9. 1~45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오.
        // 단, 중복 숫자는 허용하지 않음!!
        Random randClass = new Random();
        int[] rottoList = new int[6];
        for (int i = 0; i < rottoList.length; i++) {
            int temp = randClass.nextInt(45) + 1;//랜덤으로 숫자를 선택하는 경우 int temp =rd.nextInt(숫자) + 1;
            for (int j = 0; j < i; j++) {
                if (rottoList[j] == temp) {//temp : 데이터 임시 보관(임시 변수)
                    temp = randClass.nextInt(45) + 1;
                    j = -1;
                }
            }
            rottoList[i] = temp;
        }
        System.out.println(Arrays.toString(rottoList));
    }
}

//       for (int i=0; i<rottoList.length; i++) {
//            rottoList[i] = randClass.nextInt(45) + 1;
//            for (int j=0; j<i; j++) {
//                if (rottoList[j] == rottoList[i]) {
//                    i = i - 1;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(rottoList));}