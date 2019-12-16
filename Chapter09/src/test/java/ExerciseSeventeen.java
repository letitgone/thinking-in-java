/**
 * @Author ZhangGJ
 * @Date 2019/05/05
 */
interface StaticFinalTest {
		String RED = "Red";
}
class Test implements StaticFinalTest {
		public Test() {
				// Compile-time error: cannot assign a value
				// to final variable RED:
				//!  RED = "Blue";
		} }
public class ExerciseSeventeen {
		public static void main(String args[]) {
				// Accessing as a static field:
				System.out.println("StaticFinalTest.RED = " + StaticFinalTest.RED);
		}
}
