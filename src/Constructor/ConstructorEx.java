package Constructor;

/**
 * 생성자(Constructor)
 * 생성자는 인스턴스를 초기화 해주는 인스턴스 메서드이다
 * 생성자를 사용하여 코드의 양을 줄일 수 있다
 * 편리하게 인스턴스 변수를 초기화 할 수 있다
 *
 * 생성자 규칙
 * 1. 생성자 이름은 클래스와 이름이 같아야 한다
 * 2. 생성자는 초기화가 목적이기 때문에 반환값이 없으므로 반환 타입을 설정하지 않는다
 * 3. 모든 클래스는 반드시 생성자를 가져야 한다
 */

public class ConstructorEx {
    public static void main(String[] args) {
        Car car_1 = new Car();                           // 기본 생성자 호출
        Car car_2 = new Car("H사", "auto", 4);   // 매개변수가 있는 생성자 호출

        System.out.println(car_1.brand);
        System.out.println(car_2.brand);
    }
}

class Car {
    String brand;
    String type;
    int door;

    /**
     * 기본 생성자
     * 매개변수가 없는 생성자를 기본 생성자라고 한다
     * 생성자가 하나도 없을 시 컴파일러가 자동으로 기본 생성자를 만든다
     * 생성자가 한 개 이상일 시 반드시 기본 생성자를 만들어야 한다
     */
    Car() { }       // 기본 생성자


    /**
     * 매개변수가 있는 생성자
     * 인스턴스를 만들 때 값을 전달하여 인스턴스 변수를 초기화할 수 있다
     * 따로 초기화 하지 않고 Car car_2 = new Car("H사", "auto", 4); 이렇게 한 번에 초기화할 수 있어 코드의 양을 줄일 수 있다.
     */

    Car(String a, String b, int c) {        // 매개변수가 있는 생성자
        brand = a;
        type = b;
        door = c;
    }
}
