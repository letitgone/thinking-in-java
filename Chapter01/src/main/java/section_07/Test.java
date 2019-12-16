package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/03/11
 */
public class Test {
		/**
		 * 多态
		 * @param shape
		 */
		public static void doSomething(Shape shape){
				shape.erase();
				shape.draw();
		}
		public static void main(String[] args) {
				Circle circle = new Circle();
				doSomething(circle);
				Shape shape = new Shape();
				doSomething(shape);
		}
}
