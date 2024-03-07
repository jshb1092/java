import java.util.Scanner;

public class Leeyt14 {
    public static void main(String[] args) {
        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputstr = scan2.nextLine();
        boolean found = false;
        int k = 0;
        for (; k < members.length; k++) { // 조건을 못찾아서 false되서 for문에서 나왔다
            if (members[k].equalsIgnoreCase(inputstr)) {
                System.out.println(members[k] + "님 환영합니다");
                break;//break가 되도 for문에 만들어졌기때문에 k가 존재한다
            }
            System.out.println(k);
        }
        System.out.println(k);
        if (k == members.length) {//k == members 는 index
            System.out.println("회원가입해주세요");
        }
    }
}