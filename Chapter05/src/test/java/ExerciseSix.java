/**
 * @Author ZhangGJ
 * @Date 2019/03/27
 */
public class ExerciseSix {
    void bark(int i, String s) {
        System.out.println("barking");
    }

    void bark(String s, int i) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        ExerciseSix e = new ExerciseSix();
        e.bark(1, "xxxx");
        e.bark("xxxx", 1);
    }
}
