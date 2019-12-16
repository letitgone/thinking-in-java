/**
 * @Author ZhangGJ
 * @Date 2019/05/06
 */
interface SimpleInterface {
		void f();
}
class SimpleClass {
		protected class Inner implements SimpleInterface {
				// Force constructor to be public:
				public Inner() {}
				public void f() {
						System.out.println("Success!");
				}
		}
}
public class ExerciseSix extends SimpleClass {
		public SimpleInterface get() {
				return new Inner();
		}
		public static void main(String args[]) {
				new ExerciseSix().get().f();
		}
}
