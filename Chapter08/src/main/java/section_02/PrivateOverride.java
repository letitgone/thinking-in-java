package section_02;


class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}
