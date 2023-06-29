package Object;

/**
 * 호출 스택
 * 호출 스택은 메서드가 수행에 필요한 메모리가 제공되는 공간이다
 * 메서드가 호출되면 호출 스택에 메모리 할당, 종료되면 메모리가 해제된다
 * 호출 스택 상단에 위치한 메서드만 실행되고 나머지는 대기한다.
 */

public class Ex_5 {
    public static void main(String[] args) {
        firstStack();
    }

    /**
     * 처음 자바 파일을 실행하면 호출 스택에 main 메서드 먼저 올라가게 되고 그 뒤 호출 순서에 따라 메서드가 쌓인다
     * 마지막 세 번째 메서드가 실행되면 해당 메서드 부터 호출 스택에서 해제된다.
     */

    static void firstStack() {
        secondStack();
        System.out.println("첫 번째 메서드");
    }

    static void secondStack() {
        thirdStack();
        System.out.println("두 번째 메서드");
    }

    static void thirdStack() {
        System.out.println("세 번째 메서드");
    }
}
