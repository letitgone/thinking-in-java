package section_09;

/**
 * @Author ZhangGJ
 * @Date 2019/03/20
 */
public class Exponents {
		// Uppercase and lowercase 'e' are the same
		public static void main(String[] args) {
				float expFloat = 1.39e-43f;
				expFloat = 1.39E-43f;
				System.out.println(expFloat);
				double expDouble = 47e47d; // 'd' is optional
				double expDouble2 = 47e47; // Automatically double
				System.out.println(expDouble);
		}
}
