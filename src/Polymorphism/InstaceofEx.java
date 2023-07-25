package Polymorphism;

/**
 * instanceof 연산자
 * 참조변수의 형변환 가능 여부를 확인하는데 사용한다.
 * 가능하면 true를 반환한다.
 * 상속받는 조상 타입에 대해서는 다 true 값이 나온다.
 */

public class InstaceofEx {
    public static void main(String[] args) {

        Suv1 suv = new Suv1();
        Car1 car = new Car1();

        System.out.println(IsCkeck(suv));

        System.out.println(suv instanceof Object);
        System.out.println(suv instanceof Car1);
        System.out.println(suv instanceof Suv1);
    }

    static boolean IsCkeck(Suv1 suv) {
        if (suv instanceof Car1) {
            Car1 car = suv;
            car.drive();
            return true;
        }
        return false;
    }
}

class Car1 {
    String color;
    int door;

    void drive() {
        System.out.println("차 시동 On");
    }

    void stop() {
        System.out.println("차 시동 Off");
    }
}

class Suv1 extends Car1 {
    void suvDrive() {
        System.out.println("suv 시동 On");
    }
}