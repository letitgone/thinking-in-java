/**
 * @Author ZhangGJ
 * @Date 2019/04/01
 */
public class ExerciseNine {
		ExerciseNine(){
				this("hi");
				System.out.println("No-arg constructor");
		}
		ExerciseNine(String s){
				System.out.println("One-arg constructor: " + s);
		}

		public static void main(String[] args) {
				ExerciseNine e = new ExerciseNine();
				System.out.println("end");
		}
}
