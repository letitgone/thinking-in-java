package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/05/07
 */
public class E09_InnerClassInMethod {
    public SimpleInterface get() {
        class SI implements SimpleInterface {
            public void f() {
                System.out.println("SI.f");
            }
        }
        return new SI();
    }

    public static void main(String args[]) {
        SimpleInterface si = new E09_InnerClassInMethod().get();
        si.f();
    }
}
