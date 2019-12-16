package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Derived extends PrivateOverride {
		public void f() { System.out.println("public f()"); }
}
public class PrivateOverride {
		private void f() { System.out.println("private f()"); }
		public static void main(String[] args) {
				PrivateOverride po = new Derived();
				po.f();
		}
}
