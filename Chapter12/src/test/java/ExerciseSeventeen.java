import section_03.Frog;

/**
 * @Author ZhangGJ
 * @Date 2019/06/04
 */
class Frog2 extends Frog {
    protected void dispose() {
        super.dispose();
    }
}

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Frog2 frog = new Frog2();
        try {
            // No return in the middle...
        } finally {
            frog.dispose();
        }
        frog = new Frog2();
        try {
            // With return in the middle...
            System.out.println("111");
            System.out.println("222");
            return;
        } finally {
            frog.dispose();
        }
    }
}
