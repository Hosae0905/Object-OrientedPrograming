package Abstract;

/**
 * 인터페이스
 * 추상 메서드의 집합이다.
 * 모든 멤버가 public이다.
 * 인터페이스의 조상은 인터페이스만 가능하다. (Object가 최고 조상이 아님)
 *
 * ※ 다중 상속이 가능하다. ※
 * 자바는 단일 상속만 가능하지만, 인터페이스를 활용하여 다중 상속을 가능하게 해준다.
 * 추상 메서드는 선언부만 존재하고 구현부가 존재하지 않기 때문에 메서드 간 충돌이 발생하지 않는다.
 *
 * ※ 인터페이스와 추상 클래스의 차이 ※
 * 추상 클래스는 일반 클래스에서 추상 메서드를 가지고 있는 형태이기 때문에 생성자, 변수 등을 가질 수 있다.
 * 인터페이스는 추상 메서드와 그외 부수적인 것들(상수, 디폴트, static 메서드) 제외하고 생성자, 변수 등을 가질 수 없다.
 */

interface Cookable {
    // 인터페이스에서 추상 메서드는 public abstract 반환 타입 메서드 명() 으로 작성해야 되지만
    // 인터페이스에서는 추상 메서드만 선언할 수 있기 때문에 앞에 키워드는 생략할 수 있다.
    // 상수 또한 public static final이 필요하지만 생략할 수 있다.

    void checkVegetable(String vegetable);
    void slice(Cookable c);
}

abstract class Recipe1 {
    abstract void checkVegetable(String vegetable);
    void read() {
        System.out.println("레시피를 읽습니다.");
    }
}

class Chef extends Recipe1 implements Cookable {
    String vegetable;

    // 인터페이스에서 선언되는 추상 메서드는 기본적인 접근 제어자가 public이기 때문에 구현할 때 조심해야 한다.
    public void checkVegetable(String vegetable) {
        System.out.println(vegetable + "의 유통기한을 확인합니다.");
        this.vegetable = vegetable;
    }

    public void slice(Cookable c) {
        System.out.println(vegetable + "을/를 " + c + " 시작합니다.");
    }

    // 인터페이스를 구현한 클래스의 인스턴스를 반환할 수 있다.
    Cookable getHeadChef() {
        Chef c = new Chef();
        return c;
    }
}


public class InterfaceEx {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.checkVegetable("당근");

        Cookable cook = new Chef();
        c.slice(cook);
        c.checkVegetable("토마토");
//        cook.read();              // Cookable 클래스에는 read라는 메서드가 없기 때문에 호출 불가

        Recipe1 recipe1 = new Chef();
        recipe1.checkVegetable("시금치");
        recipe1.read();
//        recipe1.slice(cook);      // Recipe1 클래스에는 slice라는 메서드가 없기 때문에 호출 불가

        Cookable headChef = c.getHeadChef();        //인터페이스를 구현한 클래스의 인스턴스를 반환받을 수 있다.
                                                    //메서드를 호출하는 headChef는 데이터 타입이 Cookable과 일치하거나 자동 형변환이 가능한 타입으로 바꿔줘야 한다.

    }
}
