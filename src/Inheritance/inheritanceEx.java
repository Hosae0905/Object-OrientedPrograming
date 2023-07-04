package Inheritance;

/**
 * 클래스의 관계 - 상속(Inheritance)
 * 코드의 재사용성을 높이기 위해 기존의 클래스로 새로운 클래스를 작성하는 것을 의미한다
 * 두 클래스간 조상과 자손 관계를 맺어준다
 *
 * 상속의 특징
 * 자손은 조상의 모든 멤버를 상속받는다. (단, 생성자, 초기화 블록 제외)
 * 자손의 멤버 개수가 조상보다 적을 수 없다. (같거나 많음)
 * 자손의 변경은 조상에 영향을 미치지 않는다. (조상은 자손의 멤버를 모름)
 * 반면에 조상의 멤버가 변경되면 자손까지 영향을 미친다. (조상의 멤버가 자손에게 상속되기 때문)
 * Java에서는 하나의 부모만 상속하는 단일 상속만 허용한다.
 * 다중 상속은 메서드간 충돌 문제가 발생할 수 있기 때문에 허용하지 않는다
 */

public class inheritanceEx {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.saveMyMoney());            //조상의 money가 변경될 시 자손의 money도 변경됨
        System.out.println(c.saveParentMoney());        //자손의 money가 변경되도 조상의 money는 변경되지 않음
    }

}

// 조상이 따로 선언되지 않은 클래스는 자동적으로 최상위 클래스인 Object 클래스를 상속받게 된다
// 따라서 모든 클래스의 최상위 조상은 Object로 해당 클래스에 정의된 11개의 메서드를 상속받게 된다.
class Parent {
    int parentMoney = 12000;
    int account = 0;

    int saveParentMoney() {
        account += parentMoney;
        return account;
    }
}

class Child extends Parent {

    int myMoney = 2000;
    int account = 0;

    int saveMyMoney() {
        account = myMoney + parentMoney;    //상속받은 부모의 돈을 내 돈과 합하여 내 계좌로 저장
        return account;
    }
}
