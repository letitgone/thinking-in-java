/**
 * @Author ZhangGJ
 * @Date 2019/04/22
 */
interface BaseInterface {
		void f();
}
interface IntermediateInterface1 extends BaseInterface {
		void f();
}
interface IntermediateInterface2 extends BaseInterface {
		void f();
}
interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
		void f();
}
class CombinedImpl implements CombinedInterface {
		public void f() {
				System.out.println("CombinedImpl.f()");
		}
}
public class ExerciseThirteen {
		public static void main(String[] args) {
				new CombinedImpl().f();
		}
}
