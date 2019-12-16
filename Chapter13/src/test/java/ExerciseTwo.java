import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/06/09
 */
public class ExerciseTwo {
    public String toString() {
        return " ExerciseTwo address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<ExerciseTwo> v = new ArrayList<ExerciseTwo>();
        for (int i = 0; i < 10; i++)
            v.add(new ExerciseTwo());
        System.out.println(v);
    }
}
