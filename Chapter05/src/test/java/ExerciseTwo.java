/**
 * @Author ZhangGJ
 * @Date 2019/03/26
 */
public class ExerciseTwo {
		String s = "Initialized at definition";
		String s2;
		ExerciseTwo(String s3){
				s2 = s3;
		}
		public static void main(String[] args) {
				ExerciseTwo e = new ExerciseTwo("Initialized at construction");
				System.out.println("e.s = " + e.s);
				System.out.println("e.s2 = " + e.s2);
		}
}
