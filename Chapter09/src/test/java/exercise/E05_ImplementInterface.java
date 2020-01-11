package exercise;

interface AnInterface {
    void f();

    void g();

    void h();
}


class ImplementInterface implements AnInterface {
    public void f() {
        System.out.println("exercise.ImplementInterface.f");
    }

    public void g() {
        System.out.println("exercise.ImplementInterface.g");
    }

    public void h() {
        System.out.println("exercise.ImplementInterface.h");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class E05_ImplementInterface {
    public static void main(String args[]) {
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();
    }
}
