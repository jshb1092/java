public class Leeyt19 {
    static int a = 1;//class의 필드(매개변수를 안줬음)
    static int b = 2;

    public static void main(String[] args) {//하나의 같은클래스에 있기때문에 new를 쓸수 없기 떄문에 static을 써야함
        System.out.println(plusNums());//plusNums생략하고 숫자쓰면 가능
        System.out.println(plusNums(4, 5));
        int[] intArray = {1, 2, 3, 4, 5};//직접 담아서 쓰지말고 변수를 변수에 담아 써라
        System.out.println(plusNums(intArray, intArray.length));//heap뒤에 있는 코드는 자동으로 초기화됨
        System.out.println(plusNums(1,2,3,4,5));//(int a~e까지 만든 지역변수의 시그니처)
    }
    //object :모든객체의 클라스
    // 메소드의 오버로딩 : 메소드이름은 같지만 메소드 구성요소중 매개변수의 선언형이 다른것==>서로 다른메소드로 인식함
    // 메소드 시그니처 :  메소드이름,입력매개변수의 자료형
    public static int plusNums() {
        return a + b; //결과값을 만족하지않으면 main으로 돌아간다
    }

    public static int plusNums(int x, int y) {

        return x + y;
    }

    public static int plusNums(int[] intArray,int length) {//plusNums의 지역변수
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }
    //가변길이 배열 입력법이 필요한 이유
    public static int plusNums(int a,int b,int c,int d,int e){

        return a + b + c + d + e;
    }

    public static int plusNums(int a,int b,int c,int d,int e,int f){

        return a + b + c + d + e+ f;
    }
    public static int plusNums(int...values){//int... : 가변길이
        int sum = 0;
        for (int i = 0;i< values.length;i++){
            sum = sum + values[i];
        }
        return sum;
    }
}
