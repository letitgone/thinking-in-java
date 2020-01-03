package section_07;

import static net.mindview.util.Print.print;


class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}


class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99); // (1)
    }

//    static Cups cups1 = new Cups(); // (2)
//    static Cups cups2 = new Cups(); // (2)
}
