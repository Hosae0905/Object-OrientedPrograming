package Abstract;

/**
 * 추상 클래스
 * 추상 메서드(미완성 메서드)를 가지고 있는 클래스를 의미한다.
 * 추상 메서드는 구현부{}가 없는 형태를 의미한다.
 * 다른 클래스 작성에 도움을 주기 위한 것이므로 인스턴스를 생성할 수 없다.
 * 상속을 통해 추상 메서드를 완성해야 인스턴스를 생성할 수 있다.
 *
 * 추상 메서드
 * 공통적으로 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 추상 메서드를 작성한다.
 */

/**
 * 추상 클래스 작성
 * 여러 클래스에 공통적으로 사용될 수 있는 추상 클래스를 바로 작성하거나 기존 클래스의 공통 부분을 뽑아서 추상 클래스를 만든다.
 * abstract 키워드를 붙이는 이유는 개발자가 추상 메서드를 구현하게끔 강제하기 위해서 붙인다.
 *
 * 추상 클래스의 장점
 * 중복을 제거해 쉽게 작성할 수 있고, 코드의 변경이 이루어질 때 적은 부분만 변경하기 때문에 관리가 용이하다.
 * 추상 클래스를 의미있는 단계별로 만들어 놓으면 내가 원하는 곳에서 변경할 수 있다.
 * 추상화된 코드는 구체화된 코드보다 유연하여 변경에 유리하다.
 */

abstract class Recipe {
    abstract void washVegetable(String vegetable);      //공통으로 들어가는 washVegetable()를 추상 클래스로 빼서 구현
    void slice() {}
}

/**
 * 추상 클래스가 추상 메서드를 여러 개 보유할 시 상속받는 클래스는 해당 추상 메서드를 다 구현해줘야 한다.
 * 구현하지 않을 시 클래스 앞에 abstract를 명시해줘야 한다.
 */
class Cook1 extends Recipe {

    void washVegetable(String vegetable) {
        System.out.println(vegetable + "을/를 물에 씻습니다.");
    }

    void makeSource(String source) {
        System.out.println(source + "을/를 준비합니다.");
    }
}

class Cook2 extends Recipe {

    void washVegetable(String vegetable) {
        System.out.println(vegetable + "을/를 물에 씻습니다.");
    }

    void roastMeat(String meat) {
        System.out.println(meat + "을/를 준비합니다.");
    }
}


public class AbstractEx {
    public static void main(String[] args) {

        Recipe[] recipes = {new Cook1(), new Cook2()};

        /*Object obj = new Cook1();         //최고 조상인 Object에 washVetable() 이라는 구현된 메서드가 없기 때문에 에러가 발생한다.
        obj.washVegetable();*/

        for (int i = 0; i < recipes.length; i++) {
            recipes[i].washVegetable("당근");
        }
    }
}
