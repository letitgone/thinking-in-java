package section_09;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
class Groundhog2 extends Groundhog {
    public Groundhog2(int n) {
        super(n);
    }

    public int hashCode() {
        return number;
    }

    public boolean equals(Object o) {
        return o instanceof Groundhog2 && (number == ((Groundhog2) o).number);
    }
} ///:~


//: containers/SpringDetector2.java
// A working key.
public class SpringDetector2 {
    public static void main(String[] args) throws Exception {
        SpringDetector.detectSpring(Groundhog2.class);
    }
}
