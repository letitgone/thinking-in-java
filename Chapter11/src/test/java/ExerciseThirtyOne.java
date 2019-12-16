import java.util.Iterator;
import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/05/30
 */
class Shape {
		public void draw() {}
		public void erase() {}
}
class Circle extends Shape {
		public void draw() { print("Circle.draw()"); }
		public void erase() { print("Circle.erase()"); }
}
class Square extends Shape {
		public void draw() { print("Square.draw()"); }
		public void erase() { print("Square.erase()"); }
}
class Triangle extends Shape {
		public void draw() { print("Triangle.draw()"); }
		public void erase() { print("Triangle.erase()"); }
}
class RandomShapeGenerator implements Iterable<Shape> {
		private Random rand = new Random(47);
		private final int quantity;
		RandomShapeGenerator(int quantity) {
				this.quantity = quantity;
		}
		public Iterator<Shape> iterator() {
				return new Iterator<Shape>() {
						private int count;
						public boolean hasNext() {
								return count < quantity;
						}
						public Shape next() {
								++count;
								return nextShape();
						}
						public void remove() { // Not implemented
								throw new UnsupportedOperationException();
						}
				}; }
		private Shape nextShape() {
				switch(rand.nextInt(3)) {
						default:
						case 0: return new Circle();
						case 1: return new Square();
						case 2: return new Triangle();
				} }
}
public class ExerciseThirtyOne {
		public static void main(String[] args) {
				RandomShapeGenerator rsg = new RandomShapeGenerator(10);
				for(Shape shape : rsg)
						System.out.println(shape.getClass().getSimpleName());
		}
}
