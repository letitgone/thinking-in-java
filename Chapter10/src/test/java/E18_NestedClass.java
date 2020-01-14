/**
 * @Author ZhangGJ
 * @Date 2019/05/09
 */
class Other {
    // Specifying the nested type outside
    // the scope of the class:
    void f() {
        E18_NestedClass.Nested ne = new E18_NestedClass.Nested();
    }
}


public class E18_NestedClass {
    static class Nested {
        void f() {
            System.out.println("Nested.f");
        }
    }

    public static void main(String args[]) {
        Nested ne = new Nested();
        ne.f();
    }
}
