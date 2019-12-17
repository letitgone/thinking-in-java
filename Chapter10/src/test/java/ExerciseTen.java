/**
 * @Author ZhangGJ
 * @Date 2019/05/07
 */
public class ExerciseTen {
    public SimpleInterface get() {
        {
            class SI implements SimpleInterface {
                public void f() {
                    System.out.println("SI.f");
                }
            }
            return new SI();
        }
    }

    public static void main(String args[]) {
        SimpleInterface si = new ExerciseTen().get();
        si.f();
    }
}
