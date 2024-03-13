import Students.Students;

public class Leeyt17 {

    public Leeyt17() {
    }

    public static void main(String[] args) {
        Students tom = new Students("Tom",18,"Daejeon","1482356");
        Students steve = new Students("steve",25,"seoul","866546");
        Students paul = new Students();
    //    paul.name = "paul";// new Students.Students 괄호안에 안쓰고 하면 이름.name = "이름";
    //    paul.age = 22; //이름.age = 임의의 숫자값;
    //    paul.address = "Incheon"; // 이름.address = "지역이름";
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
        steve.displayAll();
        paul.displayAll();
        tom.displayAll();
        System.out.println(tom.getPersonalNum());

        //메소드 호출
        int[] numberList = {12,34,56,32,84,99,73,69};//호출된 변수
        int[] numberList2 = {195,654,546,375,896,725};
        getSumAvg(numberList);
        getSumAvg(numberList2);//데이터타입비교할때는 서로 같아야한다
    }
    public static void getSumAvg(int[] numberList){ //지역변수
        //7.아래 배열의 총합과 평균을 출력하시오
        int sum = 0;
        for(int i=0;i<numberList.length;i++){ //총합
            sum = sum + numberList[i];
        }
        int average = sum / numberList.length;//평균
        System.out.println(sum + " "+average);
    }
}
