package Polymorphism;

/**
 * 다형성의 장점(1) - 다형적 매개변수
 * 다형성의 장점으로는 다형적 매개변수가 가능하다는 것이다.
 * 참조형 매개변수는 메서드 호출 시, 자신과 같은 타입 또는 자손 타입의 인스턴스를 넘겨줄 수 있다.
 */

public class PolymorphismEx2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Aircondition());

        System.out.println("현재 남은 돈은 " + buyer.money + "만원 입니다.");
        System.out.println("현재 바이백 포인트는 " + buyer.buybackpoint + " 입니다.");

        Product[] p = new Product[2];
        p[0] = new Tv();
        p[1] = new Aircondition();

    }
}

class Product {
    int price;
    int buybackpoint;

    Product(int price) {
        this.price = price;
        buybackpoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Aircondition extends Product {
    Aircondition() {
        super(300);
    }

    public String toString() {
        return "Aircondition";
    }
}

class Buyer {
    int money = 1000;
    int buybackpoint = 0;

    /**
     * 매개변수에 조상인 Product를 넘겨서 처리하면 코드의 가독성이 높아진다.
     */
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        buybackpoint += p.buybackpoint;
        System.out.println(p + "을/를 구매하셨습니다.");
    }

    /**
     * 매개변수로 조상타입을 넘기지 않을 시에는 밑에 코드처럼 제품을 구매할 때마다 메서드를 생성해줘야 한다.
     * 제품이 많을 수록 메서드의 수가 증가하여 코드의 가독성을 떨어뜨린다.
     */
    void buy(Tv tv) {
        if (money < tv.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= tv.price;
        buybackpoint += tv.buybackpoint;
        System.out.println(tv + "을/를 구매하셨습니다.");
    }

    void buy(Aircondition aircondition) {
        if (money < aircondition.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= aircondition.price;
        buybackpoint += aircondition.buybackpoint;
        System.out.println(aircondition + "을/를 구매하셨습니다.");
    }
}
