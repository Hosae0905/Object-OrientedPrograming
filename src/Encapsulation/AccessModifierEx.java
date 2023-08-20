package Encapsulation;

public class AccessModifierEx {
    /**
     * 제어자
     * 클래스와 클래스의 멤버에 부가적인 의미를 부여해준다.
     * 접근 제어자와 그 외 제어자로 구분된다.
     */

    static int account = 1000;

    public static void main(String[] args) {
        Test test = new Test();
//        test.hour = 10;       // private 제어자를 가지고 있기 때문에 다른 클래스에서 접근할 수 없다.
        test.minute = 25;
        test.second = 50;
        test.date = 20;

//        test.money = 100;     // final이 붙은 변수는 상수가 되기 때문에 값을 변경할 수 없다.

        final int money = 1000;
//        money = 2000;

        account += 5000;



    }
}

class Test {
    /**
     * 접근 제어자
     * 아무것도 없으면 기본적으로 default가 된다.
     * private - 같은 클래스 내에서 접근이 가능하다.
     * default - 같은 패키지 내에서 접근이 가능하다.
     * protected - 같은 패키지 내 + 다른 패키지의 자손 클래스에서 접근이 가능하다
     * public - 접근 제한이 없다.
     */
    private int hour;
    int minute;
    protected int second;
    public int date;

    /**
     * 그 외 제어자
     * static - 클래스 변수, 클래스 초기화 블록, 클래스 메서드를 만드는데 사용된다.
     * final - 클래스, 메서드, 멤버변수, 지역변수에 사용된다.
     *         변수 앞에 붙으면 해당 변수는 상수가 된다.
     *         클래스에 붙으면 해당 클래스는 조상이 될 수 없다.
     *         메서드에 붙으면 오버라이딩이 불가능 하다.
     * abstract - 클래스, 메서드에서 사용된다.
     *            추상 클래스, 추상 메서드를 만드는데 사용된다.
     */

    final int money = 0;

}

abstract class MyWallet {
    abstract void walletAccount();
}
