import section_06.Splitting;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2019/06/11
 */
public class ExerciseEight {
    public static void split(String regex) {
        System.out.println(Arrays.toString(Splitting.knights.split(regex)));
    }

    public static void main(String[] args) {
        split("the|you");
    }
}
