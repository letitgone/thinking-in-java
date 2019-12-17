package section_08;

/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
public class OverloadingVarargs2 {
    // {CompileTimeError} (Won’t compile)

    //		static void f(float i, Character... args) {
    //				System.out.println("first");
    //		}
    //		static void f(Character... args) {
    //				System.out.print("second");
    //		}
    //		public static void main(String[] args) {
    //				f(1,'a');
    //				f('a','b');
    //		}
}
