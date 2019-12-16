import net.mindview.util.Countries;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/28
 */
public class ExerciseNineteen {
		public static void main(String[] args) {
				Set<String> s1 = new HashSet<String>(Countries.names(25));
				System.out.println(s1);
				String[] elements = s1.toArray(new String[0]);
				Arrays.sort(elements);
				Set<String> s2 = new LinkedHashSet<String>();
				for(String element : elements)
						s2.add(element);
				System.out.println(s2);
		}
}
