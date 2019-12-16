package section_06;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/06/02
 */
public class ExceptionMethods {
		public static void main(String[] args) {
				try {
						throw new Exception("My Exception");
				} catch(Exception e) {
						print("Caught Exception");
						print("getMessage():" + e.getMessage());
						print("getLocalizedMessage():" + e.getLocalizedMessage());
						print("toString():" + e);
						print("printStackTrace():");
						e.printStackTrace(System.out);
				}
		}
}
