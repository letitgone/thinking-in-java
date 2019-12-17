package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/06/03
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
