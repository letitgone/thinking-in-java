/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
class A2 {
		public A2(String s) {
				System.out.println("A2(): " + s);
		}
}
class B2 {
		public B2(String s) {
				System.out.println("2B(): " + s);
		}
}
class C2 extends A2 {
		B2 b;
		public C2(String s) {
				super(s);
				b = new B2(s);
		}
}
public class ExerciseSeven {
		public static void main(String args[]) {
				new C2("Init string");
		}
}
