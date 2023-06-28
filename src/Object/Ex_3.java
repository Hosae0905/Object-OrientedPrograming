package Object;

/**
 * 변수의 종류 3가지
 * iv(Instance Variable, 인스턴스 변수)
 * cv(Class Variable, 클래스 변수)
 * lv(Local Variable, 지역 변수)
 */

public class Ex_3 {
    public static void main(String[] args) {
        Card c = new Card();

        //클래스 변수는 클래스 파일이 메모리에 올라갈 때 하나만 생성된다.
        //클래스 변수를 사용할 때는 클래스 이름을 앞에 붙여서 사용한다
        Card.height = 50;
        Card.weight = 25;

        //인스턴스 변수는 인스턴스가 생성되었을 때 생성된다.
        c.shape = "Spade";
        c.number = 10;
        c.color = "Black";

        System.out.println("내가 뽑은 카드는 " + c.shape + c.number);
        System.out.println("색깔은 " + c.color + " 높이는 " + Card.height + " 무게는 " + Card.weight);
    }
}

class Card {

    //인스턴스 변수
    String shape;
    String color;
    int number;

    //클래스 변수
    static int weight;
    static int height;
}
