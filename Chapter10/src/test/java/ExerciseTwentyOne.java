/**
 * @Author ZhangGJ
 * @Date 2019/05/14
 */
interface I {
    void f();

    void g();

    class Nested {
        static void call(I impl) {
            System.out.println("Calling I.f()");
            impl.f();
            System.out.println("Calling I.g()");
            impl.g();
        }
    }
}


public class ExerciseTwentyOne {
    public static void main(String[] args) {
        I impl = new I() {
            public void f() {
            }

            public void g() {
            }
        };
        I.Nested.call(impl);
    }
}
