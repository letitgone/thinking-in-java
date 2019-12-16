import net.mindview.atunit.Test;
import net.mindview.atunit.TestProperty;
import net.mindview.util.OSExecute;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
enum Signal {
    GREEN, YELLOW, RED,
}


class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            // Note that you don't have to say Signal.RED
            // in the case statement:
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    public String toString() {
        return "The traffic light is " + color;
    }
}


public class E10_TrafficLightTest {
    TrafficLight testObject = new TrafficLight();

    @Test
    void initialization() {
        assert testObject.toString().equals(str(Signal.RED));
    }

    @Test
    void _change() {
        testObject.change();
        assert testObject.toString().equals(str(Signal.GREEN));
        testObject.change();
        assert testObject.toString().equals(str(Signal.YELLOW));
        testObject.change();
        assert testObject.toString().equals(str(Signal.RED));
    }

    @TestProperty
    private static String str(Signal s) {
        return "The traffic light is " + s;
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java " + " net.mindview.atunit.AtUnit E10_TrafficLightTest");
    }
}
