package Object;

/**
 * 매개변수
 * 매개변수는 기본형 매개변수와 참조형 매개변수가 있다
 * 기본형 매개변수: 변수의 값을 읽을 수만 있다.(Read Only)
 * 참조형 매개변수: 변수의 값을 읽고 변경할 수 있다.(Read & Write)
 */

class Data1 { int x; }
class Data2 { int x; }
class Data3 { int x; }

public class Ex_6 {
    public static void main(String[] args) {

        Data1 d1 = new Data1();
        Data2 d2 = new Data2();
        Data3 d3 = new Data3();

        //기본형 매개변수 예제
        //기본형 타입을 넘겨주기 때문에 읽기만 가능하다
        /*d1.x = 10;
        System.out.println("main() : x = " + d1.x);

        change(d1.x);
        System.out.println("After change(d1.x)");
        System.out.println("main() : x = " + d1.x);*/

        //참조형 매개변수 예제
        //객체를 넘겨주기 때문에 해당 객체를 읽고 수정할 수 있다.
        /*d2.x = 10;
        System.out.println("main() : x = " + d2.x);

        dataChange(d2);
        System.out.println("dataChange(d2.x)");
        System.out.println("main() : x = " + d2.x);*/


        //참조형 매개변수 & 참조형 반환타입
        //참조형 반환타입은 메서드에서 객체를 만들고 해당 객체의 주소를 반환한다.
        d3.x = 10;
        System.out.println("main() : x = " + d3.x);

        Data3 d4 = referenceData(d3);   //메서드에서 만든 tmp객체와 같은 주소값을 가지게 된다.
        System.out.println(d4);         //출력해보면 tmp와 주소값이 같은걸 확인할 수 있다.

        System.out.println("referenceData(d3.x)");
        System.out.println("main() : x = " + d4.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    static void dataChange(Data2 d) {
        d.x = 1000;
    }

    static Data3 referenceData(Data3 d) {

        Data3 tmp = new Data3();
        
        d.x = 50;
        tmp.x = d.x;
        System.out.println(tmp);
        return tmp;
    }
}


