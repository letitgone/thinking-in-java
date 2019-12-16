/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
abstract class BaseWithPrint {
		public BaseWithPrint() { print(); }
		public abstract void print();
}
class DerivedWithPrint extends BaseWithPrint {
		int i = 47;
		public void print() {
				System.out.println("i = " + i);
		}
}
public class ExerciseThree {
		public static void main(String args[]) {
				DerivedWithPrint dp = new DerivedWithPrint();
				dp.print();
		}
}
