package upcasting;

/**
 * @Author ZhangGJ
 * @Date 2019/12/27 06:26
 */
public class Test {

    void doSomething(Shape shape) {
        shape.draw();
        shape.erase();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Line line = new Line();
        Triangle triangle = new Triangle();
        new Test().doSomething(circle);
    }
}
