/**
 * @Author ZhangGJ
 * @Date 2019/07/24
 */
public class E09_GenericMethods2 {
    public <A, B, C> void f(A a, B b, C c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {
        E09_GenericMethods2 gm = new E09_GenericMethods2();
        gm.f("", 1, 1.0);
        gm.f(1.0F, 'c', gm);
    }
}
