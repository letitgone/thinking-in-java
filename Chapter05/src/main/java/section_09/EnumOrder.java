package section_09;

/**
 * @Author ZhangGJ
 * @Date 2019/04/04
 */
public class EnumOrder {
		public static void main(String[] args) {
				for (Spiciness s : Spiciness.values()) {
						System.out.println(s + ". ordinal " + s.ordinal());
				}
		}
}
