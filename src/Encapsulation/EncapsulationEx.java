package Encapsulation;

/**
 * 캡슐화 - Encapsulation
 * 접근 제어자를 사용하여 캡슐화를 하는 이유는 뭘까?
 * 캡슐화를 통해서 외부로부터 데이터를 보호할 수 있다.
 * 멤버변수의 직접 접근을 막아서 데이터를 보호할 수 있다.
 * 멤버변수를 사용하기 위해서는 메서드를 통해서 간접 접근을 허용해 사용한다.
 * 외부에는 불필요하고 내부적으로만 사용되는 부분을 감추기 위해서 사용한다.
 */

public class EncapsulationEx {
    public static void main(String[] args) {
        Time time = new Time();
//        time.hour = 25;       //해당 코드처럼 멤버변수에 직접 접근하면 의도하지 않은 값이 저장될 수 있다.
        time.setHour(13);       //해당 코드처럼 메서드를 통해서 간접 접근을 하여 멤버 변수에 접근한다.
        System.out.println("현재 시각은 " + time.getHour() + "시 입니다.");
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        /*if (hour > 0 || hour < 24) {
            this.hour = hour;

        }*/

        // 받아온 hour 값은 메서드를 통해 검사하고 유효한 값이면 저장한다.
        if (isValidHour(hour)) {
            this.hour = hour;
        }
        return;
    }

    public int getHour() {
        return hour;
    }

    //해당 메서드처럼 외부에서는 불필요하고 쓸일이 없는 메서드는 굳이 public으로 만들 필요 없이 private으로 작성해준다.
    private boolean isValidHour(int hour) {
        if (hour < 0 || hour > 23) {
            return true;
        }
        return false;
    }
}
