import java.util.Collection;
import java.util.HashSet;

/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class ExerciseTwo {
		public static void main(String[] args) {
				Collection<Integer> c = new HashSet<Integer>();
				for(int i = 0; i < 10; i++)
						c.add(i); // Autoboxing
				for(Integer i : c)
						System.out.print(i + ", ");
		}
}
