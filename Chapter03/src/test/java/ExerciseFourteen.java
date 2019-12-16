/**
 * @Author ZhangGJ
 * @Date 2019/03/22
 */
public class ExerciseFourteen {
		static void compare(String s1, String s2){
				boolean b1 = s1.equals(s2);
				boolean b2 = (s1 == s2);
				boolean b3 = (s1 != s2);
				System.out.println("b1: " + b1);
				System.out.println("b2: " + b2);
				System.out.println("b3: " + b3);
				System.out.println("==================");
		}

		public static void main(String[] args) {
				compare("b", "a");
				compare("hello", "hello");
				String s = new String("hello");
				compare("hello", s);
		}
}
