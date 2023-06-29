package Object;

/**
 * 메서드(선언부 + 구현부)
 * 작업 단위로 문장들을 묶고 해당 작업에 맞는 이름을 붙인 것
 * 메서드는 클래스 내에서 존재해야 한다
 * 메서드는 하나의 기능만 수행하도록 작성한다
 * 메서드는 하나의 값만 리턴하기 때문에 여러 값을 리턴하려면 배열로 리턴하자
 */

public class Ex_4 {
    public static void main(String[] args) {
       int a = 3;
       int b = 5;

       addTest(a,b);                // 메서드를 사용할 때 그냥 사용할 수 있지만 밑에 코드처럼 변수에 대입해서 사용할 수 있다.
       int result = addTest(a,b);

        System.out.println(result);

    }

    //매개변수로 주어진 변수 x와 y는 지역변수이기 때문에 다른 메서드의 매개변수와 이름이 중복되도 에러가 발생하지 않는다.
    static int addTest(int x, int y) {
        return x + y;
    }

    static int subTest(int x, int y) {
        return y - x;
    }
}

