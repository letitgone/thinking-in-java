/**
 * @Author ZhangGJ
 * @Date 2019/05/08
 */
public class E12_AnonymousInnerClassAccess {
    private int i = 10;

    private void f() {
        System.out.println("E12_AnonymousInnerClassAccess.f");
    }

    public void h() {
        new Object() {
            void g() {
                i++;
                f();
            }
        }.g();
        System.out.println("i = " + i);
    }

    public static void main(String args[]) {
        E12_AnonymousInnerClassAccess ica = new E12_AnonymousInnerClassAccess();
        ica.h();
    }
}
