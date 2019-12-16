package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/03/17
 */
public class ExerciseSix {
		String s = "Hello,World";
		int storage(String s){
				return s.length() * 2;
		}

		void print(){
				System.out.println(storage(s));
		}

		public static void main(String[] args) {
				ExerciseSix e = new ExerciseSix();
				e.print();
		}
}
