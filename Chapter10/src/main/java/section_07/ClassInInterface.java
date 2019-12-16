package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/05/14
 */
public interface ClassInInterface {
		void howdy();
		class Test implements ClassInInterface {
				public void howdy() {
						System.out.println("Howdy!");
				}
				public static void main(String[] args) {
						new Test().howdy();
				}
		}
}
