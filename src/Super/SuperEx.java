package Super;

/**
 * 참조변수 super & 생성자 super()
 * 두 개는 서로 다른 역할을 한다 - 헷갈리면 안됨
 *
 * 참조변수 super
 * 객체 자신을 가리키는 참조변수를 의미한다.
 * 조상의 멤버와 자손의 멤버를 구별할 때 사용한다.
 */

public class SuperEx {
    public static void main(String[] args) {
        Child c = new Child();
        c.saveMoney();

        Child1 c1 = new Child1();
        c1.myMoney();
    }

}

class Parent {
    int Money = 10000;
}

class Child extends Parent {
    int Money = 2000;
    int account = 0;

    int saveMoney() {
        account = Money + super.Money;      //조상의 멤버변수와 자손의 멤버변수의 이름이 같아 참조변수 super를 사용하여
        return account;                     //멤버변수를 구분한다
    }
}

class Child1 extends Parent {

    /*
    * 참조변수 this를 사용해도 같은 결과를 얻는 이유는 조상에거 상속받은 멤버변수가 있기 때문에 참조변수 this를 사용할 수 있다.
    * */

    void myMoney() {
        System.out.println("현재 잔액은 " + this.Money);
        System.out.println("현재 잔액은 " + super.Money);
    }
}
