/**
 * @Author ZhangGJ
 * @Date 2019/06/02
 */
class Thrower {
		public void f() {
				// Compiler gives an error: "unreported
				// exception MyException; must be caught
				// or declared to be thrown"
				//! throw new MyException("Inside f()");
		}
		public void g() throws MyException {
				throw new MyException("Inside g()");
		}
}
public class ExerciseEight {
		public static void main(String args[]) {
				Thrower t = new Thrower();
				try {
						t.g();
				} catch(MyException e) {
						e.printMsg();
				}
		}
}
