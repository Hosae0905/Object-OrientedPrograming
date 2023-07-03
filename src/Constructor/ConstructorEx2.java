package Constructor;

/**
 * 생성자 this()와 참조변수 this
 * 
 * 생성자 this()
 * 생성자에서 다른 생성자를 호출할 때 사용한다.
 * 다른 생성자를 호출할 시 반드시 첫 줄에서만 사용한다
 * 코드의 중복을 제거하기 위해 사용한다
 * 
 * 참조변수 this
 * 인스턴스 자신을 가리키는 변수를 의미한다
 * 인스턴스 메서드에서 사용하고, 지역 변수와 인스턴스 변수를 구별하기 위해 사용한다
 * 같은 클래스 안에서는 this를 생략할 수 있다
 */

public class ConstructorEx2 {
    public static void main(String[] args) {

        Bike MyBike = new Bike();

        // 중간에 브랜드 이름이 바뀐다고 가정할 시 따로 처리해주는 것이 아닌 생성자를 통해서 처리하여 코드의 중복을 줄인다.
        // 생성자가 없으면 MyBike2 인스턴스를 생성하고 해당 인스턴스의 변수에 접근해 값을 변경해야하는 번거러움이 있다.
        Bike MyBike2 = new Bike("K사");


        System.out.println("저의 Bike의 브랜드는 " + MyBike.brand + " 종류는 " + MyBike.type + " 바퀴의 갯수는 " + MyBike.wheel + " 입니다.");
        System.out.println("저의 Bike의 브랜드는 " + MyBike2.brand + " 종류는 " + MyBike2.type + " 바퀴의 갯수는 " + MyBike2.wheel + " 입니다.");
    }
}

class Bike {
    String brand;
    String type;
    int wheel;

    Bike() {
        this("H사", "electronic", 2);
        /*
        * brand = "H사"
        * this("H사", "electronic", 2);
        * 이런 식으로 첫 줄에 변수에 값을 대입하고 그 다음 줄에 생성자를 호출하면 에러가 발생한다.
        * */
    }

    Bike(String brandName) {
        this(brandName, "electronic", 2);
    }

    Bike(String brand, String type, int wheel) {
        this.brand = brand;
        this.type = type;
        this.wheel = wheel;
    }

    /*
    현재 사용하는 지역 변수와 값을 저장해야 되는 인스턴스 변수랑 이름이 같다
    참조변수 this를 사용해서 지역 변수와 인스턴스 변수를 구분해준다
    Bike(String brand, String type, int wheel) {
        brand = brand;
        type = type;
        wheel = wheel;
    }*/

}

