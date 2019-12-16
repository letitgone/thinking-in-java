///**
// * ???
// * @Author ZhangGJ
// * @Date 2019/04/09
// */
//class WithFinals {
//		// Identical to "private" alone:
//		private final void f() { System.out.println("WithFinals.f()"); }
//		// Also automatically "final":
//		private void g() { System.out.println("WithFinals.g()"); }
//}
//class OverridingPrivateE20 extends WithFinals {
//		@Override
//		private final void f() {
//				System.out.println("OverridingPrivateE20.f()");
//		}
//		@Override private void g() {
//				System.out.println("OverridingPrivateE20.g()");
//		} }
//class OverridingPrivate2E20 extends OverridingPrivateE20 {
//		@Override public final void f() {
//				System.out.println("OverridingPrivate2E20.f()");
//		}
//		@Override public void g() {
//				System.out.println("OverridingPrivate2E20.g()");
//		} }
//public class ExerciseTwenty {
//		public static void main(String[] args) {
//				OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
//				op2.f();
//				op2.g();
//		}
//}
