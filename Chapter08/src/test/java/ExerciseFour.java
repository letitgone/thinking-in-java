/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
class Shape1 {
		public void draw() {}
		public void erase() {}
		public void msg() { System.out.println("Base class msg()"); }
}


class Circle1 extends Shape1 {
		public void draw() { System.out.println("Circle1.draw()"); }
		public void erase() { System.out.println("Circle1.erase()"); }
		public void msg() { System.out.println("Circle1.msg()"); }
}


class Square1 extends Shape1 {
		public void draw() { System.out.println("Square1.draw()"); }
		public void erase() { System.out.println("Square1.erase()"); }
		public void msg() { System.out.println("Square1.msg()"); }
}


class Triangle1 extends Shape1 {
		public void draw() { System.out.println("Triangle1.draw()"); }
		public void erase() { System.out.println("Triangle1.erase()"); }
		public void msg() { System.out.println("Triangle1.msg()"); }
}


class Tetrahedron extends Shape1 {
		public void draw() { System.out.println("Tetrahedron.draw()"); }
		public void erase() { System.out.println("Tetrahedron.erase()"); }
		public void msg() { System.out.println("Tetrahedron.msg()"); }
}


public class ExerciseFour {
		public static void main(String args[]) {
				Shape1[] Shape1s = {
						new Circle1(), new Square1(), new Triangle1(),new Tetrahedron(),
				};
				// Make polymorphic method calls:
				for(Shape1 Shape1 : Shape1s) {
						Shape1.draw();
						Shape1.erase();
						Shape1.msg();
				}
		}
}
