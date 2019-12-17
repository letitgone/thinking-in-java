/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
class hungry {
    public hungry(String s) {
        System.out.println(s);
    }
}


public class ExerciseEight extends hungry {
    public ExerciseEight() {
        super("I'm very hungry!!!");
        System.out.println("...");
    }

    public ExerciseEight(String s) {
        super("I'm very hungry!!!");
        System.out.println(":");
    }

    public static void main(String[] args) {
        new ExerciseEight();
        new ExerciseEight("I want to eat noodle!");
    }
}
