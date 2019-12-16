/**
 * @Author ZhangGJ
 * @Date 2019/05/07
 */
public class ExerciseNine {
		public SimpleInterface get() {
				class SI implements SimpleInterface{
						public void f() { System.out.println("SI.f"); }
				}
				return new SI();
		}
		public static void main(String args[]) {
				SimpleInterface si = new ExerciseNine().get();
				si.f();
		}
}
