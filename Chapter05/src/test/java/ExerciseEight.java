/**
 * @Author ZhangGJ
 * @Date 2019/03/28
 */
public class ExerciseEight {
    public void a() {
        b();
        this.b();
    }

    public void b() {
        System.out.println("b() called");
    }

    public static void main(String args[]) {
        new ExerciseEight().a();
    }
}
