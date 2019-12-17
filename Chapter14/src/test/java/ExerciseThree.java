import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/06/13
 */
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();

}


class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}


class Square extends Shape {
    public String toString() {
        return "Square";
    }
}


class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}


class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}


public class ExerciseThree {
    public static void main(String[] args) {
        List<Shape> shapes =
                Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : shapes)
            shape.draw();
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = (Rhomboid) shape;
        // Downcast to Circle. Succeeds at compile time,
        // but fails at runtime with a ClassCastException:
        Shape shape1 = new Circle();
        Circle c = (Circle) shape1;
    }
}
