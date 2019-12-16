import java.awt.*;
import java.util.Date;
import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
interface TimeStamped {
    long getStamp();
}


class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImp() {
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}


interface SerialNumbered {
    long getSerialNumber();
}


class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public long getSerialNumber() {
        return serialNumber;
    }
}


interface Basic {
    public void set(String val);

    public String get();
}


class BasicImp implements Basic {
    private String value;

    public void set(String val) {
        value = val;
    }

    public String get() {
        return value;
    }
}


class Mixin extends BasicImp implements TimeStamped, SerialNumbered {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber = new SerialNumberedImp();

    public long getStamp() {
        return timeStamp.getStamp();
    }

    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
}


interface Colored {
    Color getColor();
}


class ColoredImp implements Colored {
    private static Random rnd = new Random(47);
    private final Color clr = new Color(rnd.nextInt(16777216));  // 2^24

    public Color getColor() {
        return clr;
    }
}


class Mixin2 extends Mixin implements Colored {
    private Colored colored = new ColoredImp();

    public Color getColor() {
        return colored.getColor();
    }
}


public class E37_Mixins2 {
    public static void main(String[] args) {
        Mixin2 mixin1 = new Mixin2(), mixin2 = new Mixin2();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(
            mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber() + " " + mixin1
                .getColor());
        System.out.println(
            mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber() + " " + mixin2
                .getColor());
    }
}
