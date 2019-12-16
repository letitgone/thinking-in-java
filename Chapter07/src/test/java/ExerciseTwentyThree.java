/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
class LoadTest {
		// The static clause is executed
		// upon class loading:
		static {
				System.out.println("Loading LoadTest");
		}
		static void staticMember() {}
}
public class ExerciseTwentyThree {
		public static void main(String args[]) {
				System.out.println("Calling static member");
				LoadTest.staticMember();
				System.out.println("Creating an object");
				new LoadTest();
		}
}
