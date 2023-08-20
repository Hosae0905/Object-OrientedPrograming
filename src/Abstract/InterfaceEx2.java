package Abstract;

/**
 * 인터페이스의 장점
 * 1. 선언(설계)와 구현을 분리시킬 수 있다.
 * 2. 변경에 유리하게 유연한 설계를 할 수 있다.
 * 3. 개발시간을 단축할 수 있다.
 * 4. 표준화가 가능하여 변경을 줄일 수 있다.
 * 5. 서로 관계없는 클래스들 간의 관계를 맺어줄 수 있다.
 */

class Machine {
    /*public void click(Beverage beverage, String type) {
        beverage.clickProduct(type);
    }*/

    public void click(Clickable click, String type) {       //인터페이스를 매개변수로 받아서 사용하면 클래스를 변경하지 않아도 된다.
        click.clickProduct(type);
    }
}

interface Clickable {
    void clickProduct(String type);
}

class Beverage implements Clickable{
    public void clickProduct(String type) {
        System.out.println(type + " 을/를 선택하셨습니다.");
    }

    Clickable clickable() {
        Beverage beverage = new Beverage();
        return beverage;
    }
}

class Snack implements Clickable {
    public void clickProduct(String type) {
        System.out.println(type + " 을/를 선택하셨습니다.");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.click(new Beverage(), "콜라");        //인터페이스가 없으면 품목이 변경될 시 Machine 클래스도 변경해야 한다.
        machine.click(new Snack(), "초콜릿");          // 품목을 추가해도 Machine 클래스를 변경하지 않고 추가할 수 있다.
    }
}
