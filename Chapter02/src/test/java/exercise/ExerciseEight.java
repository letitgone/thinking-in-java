package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/03/17
 */
public class ExerciseEight {
		static int i = 47;
		public static void main(String[] args) {
				ExerciseEight st1 = new ExerciseEight();
				ExerciseEight st2 = new ExerciseEight();
				System.out.println(st1.i + " == " + st2.i);
				st1.i++;
				System.out.println(st1.i + " == " + st2.i);
		}
}
