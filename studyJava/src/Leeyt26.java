package sec02_Typecasting.EX03_Leeyt26;

/*캐스팅이 가능 여부를 확인할 수 있는 instanceof*/

class A{}
class B extends A{}
class C extends B {}
class D extends B {}

public class Leeyt26 {
    public static void main(String[] args) {
        //instanceof
        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A);
        System.out.println(ab instanceof A);

        System.out.println(aa instanceof B);
        System.out.println(ab instanceof B);

        //10000라인의 코드가 있음
        //아래에서 ab변수들  B 또는 C 타입으로 캐스팅이 필요할 경우!!!
        if (aa instanceof B) {
            B b = (B) aa;
            System.out.println("aa를 B로 캐스팅했습니다");
        }else {
            System.out.println("aa는 B타입으로 캐스팅이 불가능!!!");
        }
        if (ab instanceof B) {
            B b = (B)ab;
            System.out.println("ab를 B로 캐스팅했습니다");
        } else if (ab instanceof C){
            C c = (C)ab;//A->C 다운캐스팅(수동변환) : 불가능
        }else {
            System.out.println("둘 다 아니네..망했음!!");
        }
        B bd = new D();
        D d =(D)bd;//B->D 다운캐스팅 (수동변환)
        A ad = new D();
        B b1 = (B)ad;//A->B 다운캐스팅(수동변환)
        D d1 = (D)ad;//A->D 다운캐스팅(수동변환)
    }
}
