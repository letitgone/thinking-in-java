/**
 * @Author ZhangGJ
 * @Date 2019/05/06
 */
public class ExerciseSeven {
    private int i = 10;

    private void f() {
        System.out.println("E07_InnerClassAccess.f");
    }

    class Inner {
        void g() {
            i++;
            f();
        }
    }

    public void h() {
        Inner in = new Inner();
        in.g();
        System.out.println("i = " + i);
    }

    public static void main(String args[]) {
        ExerciseSeven ica = new ExerciseSeven();
        //				ExerciseSeven.Inner x = ica.new Inner();
        ica.h();
    }
}
