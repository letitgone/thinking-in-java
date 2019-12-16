package section_01;

import static net.mindview.util.Print.*;

/**
 * @Author ZhangGJ
 * @Date 2019/06/09
 */

public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q); // howdy
        String qq = upcase(q);
        print(qq); // HOWDY
        print(q); // howdy
    }
}
