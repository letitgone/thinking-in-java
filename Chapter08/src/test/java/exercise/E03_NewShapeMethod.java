package exercise;

class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void msg() {
        System.out.println("Base class msg()");
    }
}


class Circle extends Shape {
    public void draw() {
        System.out.println("exercise.Circle.draw()");
    }

    public void erase() {
        System.out.println("exercise.Circle.erase()");
    }

    public void msg() {
        System.out.println("exercise.Circle.msg()");
    }
}


class Square extends Shape {
    public void draw() {
        System.out.println("exercise.Square.draw()");
    }

    public void erase() {
        System.out.println("exercise.Square.erase()");
    }

    public void msg() {
        System.out.println("exercise.Square.msg()");
    }
}


class Triangle extends Shape {
    public void draw() {
        System.out.println("exercise.Triangle.draw()");
    }

    public void erase() {
        System.out.println("exercise.Triangle.erase()");
    }

    public void msg() {
        System.out.println("exercise.Triangle.msg()");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
public class E03_NewShapeMethod {
    public static void main(String args[]) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle(),};
        // Make polymorphic method calls:
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
