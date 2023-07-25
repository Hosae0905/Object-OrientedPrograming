package Polymorphism;

/**
 * 다형성(Polymorphism)
 * 여러 가지 형태를 가질 수 있다.
 * 조상 타입 참조 변수로 자손 타입 객체를 다룬다.
 * 사용할 수 있는 멤버의 개수가 달라진다.
 * 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
 */

public class PolymorphismEx {
    public static void main(String[] args) {
//        Car car = new Suv();        // 조상 타입의 참조변수로 자손 타입의 객체를 가리킬 수 있다.
//        Suv suv1 = new Car();     // 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
//        Suv suv = new Truck();    // 자손 타입의 참조변수로 같은 자손 타입의 객체를 가리킬 수 없다.

        /**
         * 객체와 참조변수의 타입이 일치할 때와 그렇지 않을때의 차이
         * 멤버를 사용할 수 있는 범위가 달라진다.
         * 자손 타입의 참조변수가 조상 타입의 객체를 가리킬 수 없는 것은
         * 조상 타입의 객체를 가리키면 기존의 자손 타입에서 보유한 멤버를 사용할 수 없는 경우가 발생하기 때문이다.
         * 형변환 때 중요한 것은 실제 인스턴스가 뭔지가 중요하다.
         */

//        Car car = null        // null로 초기화하면 객체가 없는 상태이기 때문에 형변환을 해도 멤버를 사용할 수 없다.
        Car car1 = new Car();
        Suv suv = new Suv();
        Truck truck = new Truck();

        car1 = suv;                 // car1 = (Car)suv 에서 형변환이 생략된다.
        Suv suv1 = (Suv)car1;       // 자손 타입 <-- 조상 타입. 형변환 생략이 불가하다.
        suv1.suvDrive();

        Car car2 = suv1;
        car2.drive();               // 조상의 멤버를 사용했다.
//        car2.suvDrive();          // 조상의 멤버에는 suvDrive가 없기 때문에 사용할 수 없다.

        car1 = truck;
        Truck truck1 = (Truck) car1;
        truck1.truckDrive();


    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("차 시동 On");
    }

    void stop() {
        System.out.println("차 시동 Off");
    }
}

class Suv extends Car {
    void suvDrive() {
        System.out.println("suv 시동 On");
    }
}

class Truck extends Car {
    void truckDrive() {
        System.out.println("truck 시동 On");
    }
}
