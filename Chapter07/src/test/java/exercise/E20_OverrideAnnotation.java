package exercise;

import section_08.WithFinals;

import static net.mindview.util.Print.print;


class OverridingPrivateE20 extends WithFinals {

    private final void f() {
        print("exercise.OverridingPrivateE20.f()");
    }

    private void g() {
        print("exercise.OverridingPrivateE20.g()");
    }
}


class OverridingPrivate2E20 extends OverridingPrivateE20 {

    public final void f() {
        print("exercise.OverridingPrivate2E20.f()");
    }

    public void g() {
        print("exercise.OverridingPrivate2E20.g()");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/09
 */
public class E20_OverrideAnnotation {
    public static void main(String[] args) {
        OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
        op2.f();
        op2.g();
    }
}
