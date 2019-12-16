/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
class eat{
		public eat(){
				System.out.println("I'm hungry...");
		}
}
class noodle extends eat{
		public noodle(){
				System.out.println("I want to eat noodle...");
		}
}
public class ExerciseThree extends noodle{
		public static void main(String[] args) {
				ExerciseThree e  = new ExerciseThree();
		}
}
