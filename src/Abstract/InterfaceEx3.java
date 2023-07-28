package Abstract;

/**
 * 인터페이스의 장점 중 하나로 서로 관계없는 클래스들 간의 관계를 맺어줄 수 있다.
 * Vegetable, Fruit, CookTool은 공통적으로 wash() 메서드를 사용하지만 서로 다른 조상을 상속받고 있다.
 * 해당 wash() 메서드를 인터페이스로 분리하여 관계를 형성할 수 있다.
 */

interface washable {
    void wash(String product);
}

class Recipe2 {
    void start(washable w, String product) {

        w.wash(product);
    }

}

class Ingredient {
    void takeOff() {
        System.out.println("껍질을 벗긴다.");
    }
}

class CookTool {
    void slice() {
        System.out.println("재료를 자른다.");
    }
}

class Vegetable extends Ingredient implements washable {
    public void wash(String vegetable) {
        System.out.println(vegetable + " 을/를 씻는다.");
    }
}

// 같은 Ingredient 조상을 상속 받지만 wash() 메서드를 사용하지 않기 때문에 따로 관계를 설정하지 않는다.
class Meat extends Ingredient {
    void roast(String meat) {
        System.out.println(meat + " 을/를 굽는다.");
    }
}

class Fruit extends Ingredient implements washable {
    public void wash(String fruit) {
        System.out.println(fruit + " 을/를 씻는다.");
    }
}

class Knife extends CookTool implements washable {
    public void wash(String tool) {
        System.out.println(tool + " 을/를 씻는다.");
    }
}

public class InterfaceEx3 {
    public static void main(String[] args) {
        Recipe2 recipe2 = new Recipe2();
        recipe2.start(new Vegetable(), "양파");
        recipe2.start(new Fruit(), "사과");
        recipe2.start(new Knife(), "칼");
    }
}
