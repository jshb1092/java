public class Leeyt {
    public static void main(String[] args) {
        //바깥 for문까지 탈출하는 다른 방법
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break out;
                }
                System.out.println(i + "," + j);
            }
        }

        //continue 사용법
        for (int i= 0; i< 10; i++){
            if (i % 2 ==1){ //홀수의 경우 아래 출력문을 실행하지 않음
                continue; //첫번째 홀수가 나오자마자 반복문은 끝난다
            }
            System.out.println(i);
        }
        for (int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                if(j == 3){
                    continue;
                }
                System.out.println(i+","+j);
            }
        }
    }
}