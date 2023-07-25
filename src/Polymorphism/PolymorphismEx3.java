package Polymorphism;

/**
 * 다형성의 장점 (2) - 여러 종류의 객체를 배열로 다루기
 * 조상 타입의 배열에 자손들의 객체를 담을 수 있다.
 */

public class PolymorphismEx3 {
    public static void main(String[] args) {
        Buyer1 buyer1 = new Buyer1();
        buyer1.buy(new Tv1());
        buyer1.buy(new Aircondition1());
        buyer1.buy(new Computer1());

        buyer1.totalPrice();
    }
}

class Product1 {
    int price;
    int buyBackPoint;

    Product1(int price) {
        this.price = price;
        buyBackPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product1 {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer1 extends Product1 {
    Computer1() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Aircondition1 extends Product1 {
    Aircondition1() {
        super(300);
    }

    public String toString() {
        return "Aircondition";
    }
}

class Buyer1 {
    int money = 1000;
    int buyBackPoint = 0;
    Product1[] cart = new Product1[10];     //조상 객체 배열을 생성
    int i = 0;

    void buy(Product1 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        buyBackPoint += p.buyBackPoint;
        cart[i++] = p;      //객체 배열에 구입한 제품을 저장
        System.out.println(p + "을/를 구매하셨습니다.");
    }

    void totalPrice() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) break;
            sum += cart[i].price;           //객체 배열에 저장된 자손 객체를 하나씩 호출하여 해당 제품의 가격을 더함
            itemList += cart[i] + ", ";
        }
        System.out.println("구매하신 제품의 총금액은 " + sum +"만원 입니다.");
        System.out.println("구매하신 제품은 " + itemList + "입니다.");
    }
}