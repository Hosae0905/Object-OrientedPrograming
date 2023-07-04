package Super;

/**
 * 생성자 super()
 * 상속을 받을 때 생성자는 상속받지 않기 때문에 super()를 이용하여 조상의 생성자를 호출한다.
 * 생성자의 첫 줄에는 반드시 생성자를 호출해야 하고 없을 시에 컴파일러가 자동으로 super()를 삽입한다.
 *
 * ※ 기본 생성자를 필수로 작성하는 이유 ※
 * 생성자 super()를 따로 작성하지 않으면 컴파일러가 자동으로 삽입해주지만 해당 super() 생성자는 조상의 기본 생성자를 호출한다.
 * 하지만 조상 클래스에서 생성자를 만들었을 경우 컴파일러는 기본 생성자를 자동으로 만들어 주지 않기 때문에 super()를 사용할 때 에러가
 * 발생할 수 있다.
 * 이러한 에러를 막기 위해서 기본 생성자는 필수로 작성해야 한다.
 */

public class SuperEx2 {
    public static void main(String[] args) {
        Child2 c2 = new Child2(2500, 0);
        c2.myMoney();
        c2.parentMoney();
    }
}

class Parent1 {
    int money;
    int account;

//    Parent1() {}    // 생성자를 만들면 컴파일러가 기본 생성자를 자동으로 만들어주지 않는다.

    Parent1(int money, int account) {
        this.money = money;
        this.account = account;
    }

    void parentMoney() {
        System.out.println(account + money);
    }
}

class Child2 extends Parent1 {

    int money;
    int account;

    Child2(int money, int account) {
        //super() --> Parent1() 기본 생성자 호출
        super(10000, 0);        //super()를 따로 작성해주면 기본 생성자 에러 없이 실행이 가능하다.
        this.money = money;
        this.account = account;
    }

    void myMoney() {
        System.out.println(account + money);
    }
}
