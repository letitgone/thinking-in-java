package section_01;

import java.util.ArrayList;

class Apple1 {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}


class Orange {
}


/**
 * @Author ZhangGJ
 * @Date 2020/01/15 07:45
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple1());
        }
        // Not prevented from adding an Orange to apples: apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple1) apples.get(i)).id();
        }
        // Orange is detected only at run time
    }
}
