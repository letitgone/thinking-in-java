import section_02.Detergent;

/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
class NewDetergent extends Detergent {
		public void scrub() {
				append(" NewDetergent.scrub()");
				super.scrub(); // Doesn't have to be first
		}
		public void sterilize() { append(" sterilize()"); }
}
public class ExerciseTwo {
		public static void main(String args[]) {
				NewDetergent nd = new NewDetergent();
				nd.dilute();
				nd.scrub();
				nd.sterilize();
				System.out.println(nd);
		}
}
