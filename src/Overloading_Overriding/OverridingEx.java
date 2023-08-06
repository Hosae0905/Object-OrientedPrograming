package Overloading_Overriding;

import java.io.IOException;

/**
 * 메서드 오버라이딩
 * 조상으로부터 상속받은 메서드를 자신에 맞게 재정의하는 것을 의미한다.
 *
 * 오버라이딩의 조건
 * 1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
 * 2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 * 3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
 */

public class OverridingEx {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        System.out.println(tv.myTv());

        PastaRecipe pasta = new PastaRecipe();
        System.out.println(pasta.makeFood());
    }
}

class Tv {
    String brand = "S전자";
    int size = 70;
    public String myTv() {

        return "Tv brand는 " + brand + " 이고 사이즈는 " + size + " 입니다.";
    }
}

class SmartTv extends Tv {
    int price = 10000;

    public String myTv() {
        //조상의 메서드를 물려받아 다시 재정의한다.
        //조상의 메서드보다 좁은 범위로 변경할 수 없다.
        //조상의 메서드가 예외를 2개 가지고 있을 경우 자손은 그보다 더 많이 선언할 수 없다.
        return "Tv brand는 " + brand + " 이고 사이즈는 " + size + " 가격은 "+ price + " 입니다.";
    }

}

class Recipe {
    String oil = "올리브유";
    int time = 1;

    public String makeFood() {
        return "기본 레시피\n" + "1. " + oil + "을/를 넣는다.\n"
                + "2. 물을 " + time + " 정도 끟인다.";
    }
}

class PastaRecipe extends Recipe {
    String source = "크림";

    public String makeFood() {
        return "기본 레시피\n" + "1. " + oil + "을/를 넣는다.\n"
                + "2. 물을 " + time + " 정도 끟인다.\n"
                + "3. " + source + " 을/를 넣는다";
    }
}
