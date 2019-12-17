/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class ExerciseFourteen {
    static String s1 = "Initialized at definition";
    static String s2;

    static {
        s2 = "Initialized in static block";
    }

    public static void main(String args[]) {
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
