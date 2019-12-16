/**
 * @Author ZhangGJ
 * @Date 2019/05/09
 */
public class ExerciseThirteen {
		public SimpleInterface get() {
				return new SimpleInterface() {
						public void f() {
								System.out.println("SimpleInterface.f");
						}
				};
		}
		public static void main(String args[]) {
				SimpleInterface si = new ExerciseThirteen().get();
				si.f();
		}
}
