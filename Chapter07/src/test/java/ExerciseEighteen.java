/**
 * @Author ZhangGJ
 * @Date 2019/04/09
 */
class SelfCounter {
		private static int count;
		private int id = count++;
		public String toString() { return "SelfCounter " + id; }
}
class WithFinalFields {
		final SelfCounter scf = new SelfCounter();
		static final SelfCounter scsf = new SelfCounter();
		public String toString() {
				return "scf = " + scf + "\nscsf = " + scsf;
		}
}
public class ExerciseEighteen {
		public static void main(String args[]) {
				System.out.println("First object:");
				System.out.println(new WithFinalFields());
				System.out.println("Second object:");
				System.out.println(new WithFinalFields());
		}
}
