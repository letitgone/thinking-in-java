import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/03/22
 */
public class ExerciseTwo {
		static Random r = new Random(47);
		public static void compareRand() {
				int a = r.nextInt();
				int b = r.nextInt();
				System.out.println("a = " + a + ", b = " + b);
				if(a < b)
						System.out.println("a < b");
				else if(a > b)
						System.out.println("a > b");
				else
						System.out.println("a = b");
		}
		public static void main(String[] args) {
				for(int i = 0; i < 25; i++)
						compareRand();
		}
}
