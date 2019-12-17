/**
 * @Author ZhangGJ
 * @Date 2019/03/27
 */
public class ExerciseFour {
    ExerciseFour() {
        System.out.println("Default constructor");
    }

    ExerciseFour(String s) {
        System.out.println("String arg");
        System.out.println(s);
    }

    public static void main(String[] args) {
        ExerciseFour e1 = new ExerciseFour();
        ExerciseFour e2 = new ExerciseFour("Overloaded");
    }
}
