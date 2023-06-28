package Object;

/**
 * 객체 배열
 * 객체 배열은 곧 참조변수 배열이다
 */

public class Ex_2 {
    public static void main(String[] args) {
        //객체 배열을 만들면 꼭 값을 넣어줘야 한다.
        AirCondition[] controller = new AirCondition[3];
        
        controller[0] = new AirCondition();
        controller[1] = new AirCondition();
        controller[2] = new AirCondition();

        controller[0].temp = 20;
        controller[1].temp = 10;
        controller[2].temp = 30;

        System.out.println("현재 온도는 " + controller[0].temp);
        System.out.println("현재 온도는 " + controller[1].temp);
        System.out.println("현재 온도는 " + controller[2].temp);
    }
}

class AirCondition {
    String color;
    boolean power;
    int temp;

    void powerOn() { power = !power; }
    void tempUp() { temp++; }
    void tempDown() { temp--; }

}