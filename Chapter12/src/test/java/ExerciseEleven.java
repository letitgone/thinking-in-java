/**
 * @Author ZhangGJ
 * @Date 2019/06/03
 */
class AnException2 extends Exception {}
public class ExerciseEleven {
		public void g() throws AnException2 {
				throw new AnException2();
		}
		public void f() {
				try {
						g();
				} catch(AnException2 e) {
						throw new RuntimeException(e);
				}
		}
		public static void main(String args[]) {
				ExerciseEleven ce = new ExerciseEleven();
				ce.f();
		}
}
