package section_13;

import java.util.Map;

/**
 * @Author ZhangGJ
 * @Date 2019/05/30
 */
public class EnvironmentVariables {
		public static void main(String[] args) {
				for(Map.Entry entry: System.getenv().entrySet()) {
						System.out.println(entry.getKey() + ": " +
								entry.getValue());
				}
		}
}
