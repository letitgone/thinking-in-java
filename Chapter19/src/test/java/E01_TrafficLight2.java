import section_03.Signal;

import static net.mindview.util.Print.print;
import static section_03.Signal.GREEN;
import static section_03.Signal.RED;
import static section_03.Signal.YELLOW;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E01_TrafficLight2 {
    Signal color = RED;

    public void change() {
        switch (color) {
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        E01_TrafficLight2 t = new E01_TrafficLight2();
        for (int i = 0; i < 7; i++) {
            print(t);
            t.change();
        }
    }
}
