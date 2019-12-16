package section_13;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2019/05/30
 */
public class ArrayIsNotIterable {
		static <T> void test(Iterable<T> ib) {
				for(T t : ib)
						System.out.print(t + " ");
		}
		public static void main(String[] args) {
				test(Arrays.asList(1, 2, 3));
				String[] strings = { "A", "B", "C" };
				// An array works in foreach, but it’s not Iterable:
				//! test(strings);
				// You must explicitly convert it to an Iterable:
				test(Arrays.asList(strings));
		}
}
