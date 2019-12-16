/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
interface AnInterface {
		void f();
		void g();
		void h();
}
class ImplementInterface implements AnInterface {
		public void f() { System.out.println("ImplementInterface.f"); }
		public void g() { System.out.println("ImplementInterface.g"); }
		public void h() { System.out.println("ImplementInterface.h"); }
}
public class ExerciseFive {
		public static void main(String args[]) {
				ImplementInterface imp = new ImplementInterface();
				imp.f();
				imp.g();
				imp.h();
		}
}
