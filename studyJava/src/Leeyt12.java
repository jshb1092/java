
public class Leeyt12 {
    public static void main(String[] args) {
        String[] fruitList = {"사과","소고기","컴퓨터","바나나"};
        int count = 0;
        for(int i=0; i< fruitList.length;i++) {
            if (fruitList[i] == "사과") {
                count = count + 1;
            }
            else if(fruitList[i] =="바나나") {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
