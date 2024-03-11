public class Students {

    private String name;
    private int age;
    private String address;
    private String personalNum; //private을 쓰면 기능을 숨긴다

    public Students() {//기본생성자
    }
    public Students(String name, int age, String address, String personalNum) { //모든필드를 담은 일반생성자
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;

    }
    public Students(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { //매개의 변수 //pubilc void 메소드 이름 (파라미터)//paramete == 매개변수
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public String getPersonalNum() {
        return personalNum;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void displayName(){ //메소드
        System.out.println(this.name);
    }
    public void displayAge() {
        System.out.println(this.age);
    }
    public void displayAddress() {
        System.out.println(this.address);
    }
    public void displayAll(){
        System.out.println(this.name + " " +this.age+" " + this.address);
    }
}
