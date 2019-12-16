/**
 * @Author ZhangGJ
 * @Date 2019/03/27
 */
public class ExerciseFive {
		void bark(){
				System.out.println("barking");
		}
		void bark(String s){
				System.out.println(s);
		}

		public static void main(String[] args) {
				ExerciseFive e = new ExerciseFive();
				e.bark();
				e.bark("xxxx");
		}
}
