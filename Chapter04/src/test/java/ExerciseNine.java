/**
 * @Author ZhangGJ
 * @Date 2019/03/26
 */
public class ExerciseNine {
		static int fib(int n) {
				if (n <= 2)
						return 1;
				return fib(n-1) + fib(n-2);
		}
		public static void main(String[] args) {
				// Get the max value from the command line:
				int n = Integer.parseInt(args[0]);
				if(n < 0) {
						System.out.println("Cannot use negative numbers");
						return;
				}
				for(int i = 1; i <= n; i++)
						System.out.print(fib(i) + ", ");
		}
}
