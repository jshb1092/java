public class Java20240304 {
    public static void main(String[] args) {
        int a;
        for (a = 0; a < 3; a++) {
            System.out.print(a + "");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + "");
        }
        System.out.println();
        //for문의 특수한 형태 (무한루프)
        /*
        for(int i =0; ; i++){
            System.out.print(i+"");
            }
            for(;;) {
            System.out.print("무한루프");
            }
         */
        System.out.println();

        //무한루프 탈출
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i+"");
        }
        System.out.print("무한 루프 발동");
    }
}