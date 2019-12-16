package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/03/17
 */
public class ExerciseEleven {
		int anIntegerRepresentingColors;
		void changeTheHueOfTheColor(int newHue){
				System.out.println(newHue);
		}

		public static void main(String[] args) {
				ExerciseEleven eleven = new ExerciseEleven();
				eleven.changeTheHueOfTheColor(eleven.anIntegerRepresentingColors);
		}
}
