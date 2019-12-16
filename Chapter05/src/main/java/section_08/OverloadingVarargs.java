package section_08;

/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
public class OverloadingVarargs {
		static void f(Character... args){
				System.out.println("section_01");
				for (Character c : args) {
						System.out.print(" " + c);
				}
				System.out.println();
		}
		static void f(Integer... args){
				System.out.println("section_02");
				for (Integer i : args) {
						System.out.print(" " + i);
				}
				System.out.println();
		}
		static void f(Long... args){
				System.out.println("section_03");
		}

		public static void main(String[] args) {
				f('a','b','c');
				f(1);
				f(2,1);
				f(0);
				f(0L);
				//! f(); // Won’t compile -- ambiguous
		}
}
