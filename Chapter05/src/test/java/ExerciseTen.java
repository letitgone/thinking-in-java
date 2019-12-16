/**
 * @Author ZhangGJ
 * @Date 2019/04/01
 */
public class ExerciseTen {
		protected void finalize() {
				System.out.println("finalize() called");
		}
		public static void main(String args[]) {
				new ExerciseTen();
		}
}
