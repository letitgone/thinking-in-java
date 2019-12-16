package section_02;

/**
 * 方法的重载，参数顺序不同也能区分，但是不建议使用
 *
 * @Author ZhangGJ
 * @Date 2019/03/26
 */
public class OverloadingOrder {
		static void f(String s, int i){
				System.out.println("String: " + s + ", int: " + i);
		}
		static void f(int i, String s){
				System.out.println("int: " + i + ", String: " + s);
		}
		public static void main(String[] args) {
				f("String first", 11);
				f(99, "Int first");
		}
}
