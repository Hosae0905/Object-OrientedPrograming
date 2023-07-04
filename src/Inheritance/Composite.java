package Inheritance;

/**
 * 클래스의 관계 - 포함(Composite)
 * 클래스의 멤버로 참조변수를 선언하는 것을 의미한다.
 * 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
 * 대부분은 포함관계를 사용하고 꼭 필요한 경우에 상속을 사용한다.
 *
 * 상속과 포함의 구분
 * 상속: ~은 ~이다(is-a)
 * 포함: ~은 ~을 가지고 있다(has-a)
 * ex) 원은 점이다.
 *     원은 점을 가지고 있다.
 *     예시를 보면 "원은 점을 가지고 있다" 문장이 더 적절하기 때문에 포함관계를 만들어 준다.
 */

public class Composite {
    public static void main(String[] args) {
        Point p = new Point();
        p.c.x = 5;
        p.c.y = 10;
        p.r = 12;

        // System.out.println();
        // System.out.println()도 마찬가지로 포함관계인 것을 알 수 있다
        // 먼저 System이란 클래스 안에 PrintStream 인스턴스가 존재하고 해당 인스턴스를 통해 println() 메서드를 호출한다.
    }
}

class Circle {
    int x;
    int y;
}

class Point {
    int r;

    Circle c = new Circle();

}
