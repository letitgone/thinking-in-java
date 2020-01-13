/**
 * @Author ZhangGJ
 * @Date 2019/05/09
 */
public class E13_AnonymousInnerClassInMethod {
    public SimpleInterface get() {
        return new SimpleInterface() {
            public void f() {
                System.out.println("SimpleInterface.f");
            }
        };
    }

    public static void main(String args[]) {
        SimpleInterface si = new E13_AnonymousInnerClassInMethod().get();
        si.f();
    }
}
