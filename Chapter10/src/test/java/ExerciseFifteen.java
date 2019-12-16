/**
 * @Author ZhangGJ
 * @Date 2019/05/09
 */
class NoDefault {
		private int i;
		public NoDefault(int i) { this.i = i; }
		public void f() { System.out.println("NoDefault.f"); }
}
class Second {
		public NoDefault get1(int i) {
				// Doesn't override any methods:
				return new NoDefault(i) {};
		}
		public NoDefault get2(int i) {
				// Overrides f():
				return new NoDefault(i) {
						public void f() {
								System.out.println("Second.get2.f");
						}
				};
		}
}
public class ExerciseFifteen {
		public static void main(String args[]) {
				Second sec = new Second();
				NoDefault nd = sec.get1(47);
				nd.f();
				nd = sec.get2(99);
				nd.f();
		}
}
