/**
 * @Author ZhangGJ
 * @Date 2019/04/01
 */
public class ExerciseEleven {
		protected void finalize() {
				System.out.println("finalize() called");
		}
		public static void main(String args[]) {
				new ExerciseEleven();
				System.gc();
				System.runFinalization();
		}
}
