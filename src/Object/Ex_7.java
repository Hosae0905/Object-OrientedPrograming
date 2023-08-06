package Object;

/**
 * 인스턴스 메서드 & static 메서드
 * 인스턴스 메서드: '참조변수.메서드이름()' 으로 호출한다
 *               인스턴스 멤버(변수, 메서드)와 관련된 작업을 한다
 *               인스턴스 메서드 내에서 인스턴스 변수를 사용할 수 있다
 *               인스턴스 생성없이 메서드 사용 불가
 *
 *  static 메서드: '클래스이름.메서드이름()' 으로 호출한다
 *  (클래스 메서드)  인스턴스 멤버와 관련없는 작업을 한다
 *                 static 메서드 내에서 인스턴스 변수를 사용할 수 없다.
 *                 인스턴스 생성이 필요없기 때문에 인스턴스 멤버 사용 불가
 *
 *
 *  메서드를 생성할 시 인스턴스 변수를 사용하는지를 고려하고 메서드를 생성한다.
 *  인스턴스 메서드는 사용하려면 인스턴스 변수가 필요하기 때문에 먼저 인스턴스를 생성하고 메서드를 호출한다.
 *  static 메서드는 프로그램 실행 시 클래스 변수와 메서드가 메모리에 올라가기 때문에 별도의 객체 생성이 필요하지 않다
 *
 */

public class Ex_7 {
    public static void main(String[] args) {

        MyMath1 test = new MyMath1();

        test.x = 2;
        test.y = 4;

        System.out.println(test.add());
        System.out.println(MyMath1.add(3,5));       //클래스 메서드는 클래스 이름을 같이 붙여야 한다.
        test.instanceMethod1();
    }
}

class MyMath1 {
    int x, y;

    int add() { //인스턴스 메서드
        return x + y;
    }

    static int add(int x, int y) {  //클래스 메서드
        return x + y;
    }

    void instanceMethod1() {
        System.out.println("인스턴스 메서드 1");
        instanceMethod2();
        classMethod1();     //인스턴스 메서드 내에서 클래스 메서드를 사용할 수 있다.
                            //클래스 변수와 메서드는 메모리에 올라가기 때문에 객체 생성이 필요없어 모두 사용이 가능하다.
    }

    void instanceMethod2() {
        System.out.println("인스턴스 메서드 2");

    }

    static void classMethod1() {
        System.out.println("클래스 메서드 1");
        classMethod2();
        //instanceMethod1();        //클래스 메서드 내에서 인스턴스 메서드를 사용할 수 없다
    }

    static void classMethod2() {
        System.out.println("클래스 메서드 2");
    }
}
