/**
 * @Author ZhangGJ
 * @Date 2019/06/02
 */
public class ExerciseTwo {
		public static void main(String args[]) {
				String s = null;
				// Causes a NullPointerException:
				//! s.toString();
				try {
						s.toString();
				} catch(Exception e) {
						System.out.println("Caught exception " + e);
				}
		}
}
