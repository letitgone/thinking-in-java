/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
class A extends ExerciseFive{
		public A(){
				System.out.println("Constructor A");
		}
}
class B{
		public B(){
				System.out.println("Constructor B");
		}
}
class C extends A {
		B b = new B();
}
public class ExerciseFive {
		public static void main(String[] args) {
				new C();
		}
}
