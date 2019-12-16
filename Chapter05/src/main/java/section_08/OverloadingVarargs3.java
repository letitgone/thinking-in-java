package section_08;

/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
public class OverloadingVarargs3 {
		static void f(float i, Character... args) {
				System.out.println("section_01");
		}
		static void f(char c, Character... args) {
				System.out.println("section_02");
		}
		public static void main(String[] args) {
				f(1,'a');
				f('a','b');
		}
}
