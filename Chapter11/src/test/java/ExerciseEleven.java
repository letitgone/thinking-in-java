import java.util.*;
/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class ExerciseEleven {
		public static void printToStrings(Iterator<?> it) {
				while(it.hasNext())
						System.out.println(it.next().toString());
		}
		@SuppressWarnings("unchecked")
		public static void main(String args[]) {
				List<Collection<String>> ca =
						Arrays.<Collection<String>>asList(
								new ArrayList<String>(),
								new LinkedList<String>(),
								new HashSet<String>(),
								new TreeSet<String>());
				for(Collection<String> c : ca)
						ExerciseFour.fill(c);
				for(Collection<String> c : ca)
						printToStrings(c.iterator());
		}
}
