/**
 * @Author ZhangGJ
 * @Date 2019/05/05
 */
class Outer {
		class Inner {
				{ System.out.println("Inner created"); }
		}
		Inner getInner() { return new Inner(); }
}
public class ExerciseOne {
		public static void main(String[] args) {
				Outer o = new Outer();
				Outer.Inner i = o.getInner();
		}
}
