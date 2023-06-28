package Object;

/**
 * 객체
 */

/*public class Ex_1 {

    public static void main(String[] args) {
        *//*AirCondition controller = new AirCondition();
        controller.temp = 20;

        controller.tempDown();
        System.out.println("현재 온도는 " + controller.temp + "도 입니다.");*//*

        AirCondition controller = new AirCondition();
        controller.temp = 20;

        AirCondition Hcontroller = new AirCondition();
        AirCondition Kcontroller = new AirCondition();

        Hcontroller.temp = 20;
        Hcontroller.tempUp();

        Kcontroller.temp = 15;
        Kcontroller.tempDown();

        System.out.println("현재 Hosae에어컨 온도는 " + Hcontroller.temp + "도 입니다.");
        System.out.println("현재 Kim에어컨 온도는 " + Kcontroller.temp + "도 입니다.");

        Hcontroller = Kcontroller;

        System.out.println("현재 Hosae에어컨 온도는 " + Hcontroller.temp + "도 입니다.");
        System.out.println("현재 Kim에어컨 온도는 " + Kcontroller.temp + "도 입니다.");

    }
}*/

/*class AirCondition {
    String color;
    boolean power;
    int temp;

    void powerOn() { power = !power; }
    void tempUp() { temp++; }
    void tempDown() { temp--; }

}*/

