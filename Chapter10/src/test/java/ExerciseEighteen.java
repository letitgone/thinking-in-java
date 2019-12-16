/**
 * @Author ZhangGJ
 * @Date 2019/05/09
 */
class Other {
		// Specifying the nested type outside
		// the scope of the class:
		void f() {
				ExerciseEighteen.Nested ne = new ExerciseEighteen.Nested();
		}
}
public class ExerciseEighteen {
		static class Nested {
				void f() {
						System.out.println("Nested.f");
				}
		}
		public static void main(String args[]) {
				Nested ne = new Nested();
				ne.f();
		}
}
