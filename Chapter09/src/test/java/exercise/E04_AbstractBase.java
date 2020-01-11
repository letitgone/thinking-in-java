package exercise;

abstract class NoMethods {
}


class Extended1 extends NoMethods {
    public void f() {
        System.out.println("exercise.Extended1.f");
    }
}


abstract class WithMethods {
    abstract public void f();
}


class Extended2 extends WithMethods {
    public void f() {
        System.out.println("exercise.Extended2.f");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class E04_AbstractBase {
    public static void test1(NoMethods nm) {
        // Must downcast to access f():
        ((Extended1) nm).f();
    }

    public static void test2(WithMethods wm) {
        // No downcast necessary:
        wm.f();
    }

    public static void main(String args[]) {
        NoMethods nm = new Extended1();
        test1(nm);
        WithMethods wm = new Extended2();
        test2(wm);
    }
}
