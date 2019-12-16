/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class ExerciseFifteen {
		String s;

		{
				s = "'instance initialization'";
		}

		public ExerciseFifteen() {
				System.out.println("Default constructor; s = " + s);
		}

		public ExerciseFifteen(int i) {
				System.out.println("int constructor; s = " + s);
		}

		public static void main(String args[]) {
				new ExerciseFifteen();
				new ExerciseFifteen(1);
		}
}
