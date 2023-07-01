package Overloading_Overriding;

/**
 * 메서드 오버로딩
 * 오버로딩은 한 클래스 안에 같은 이름의 메서드 여러 개를 정의하는 것이다
 * println 메서드를 확인해보면 여러 타입으로 정의되어 있다
 *
 * 오버로딩이 성립하기 위한 조건
 * 1. 메서드 이름이 같아야 한다
 * 2. 매개변수의 개수 또는 타입이 달라야 한다
 * 3. 반환 타입은 영향이 없다.
 */

public class OverloadingEx {
    public static void main(String[] args) {
        //System.out.println();     //내부 구조를 확인하면 여러 매개변수를 받는 것을 확인할 수 있다.

        OverloadingTest test = new OverloadingTest();

        System.out.println(test.calculate(5,4));
        System.out.println(test.calculate(5L, 6L));
        System.out.println(test.calculate(3.0, 5.0));
        System.out.println(test.calculate(8.0f, 10.0f));

    }
}

class OverloadingTest {

    int calculate(int x, int y) {
        return x + y;
    }

    long calculate(long x, long y) {
        return x + y;
    }

    double calculate(double x, double y) {
        return x - y;
    }

    float calculate(float x, float y) {
        return x - y;
    }
}
