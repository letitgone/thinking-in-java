package exercise;

class Shape1 {
    public void draw() {
    }

    public void erase() {
    }

    public void msg() {
        System.out.println("Base class msg()");
    }
}


class Circle1 extends Shape1 {
    public void draw() {
        System.out.println("exercise.Circle1.draw()");
    }

    public void erase() {
        System.out.println("exercise.Circle1.erase()");
    }

    public void msg() {
        System.out.println("exercise.Circle1.msg()");
    }
}


class Square1 extends Shape1 {
    public void draw() {
        System.out.println("exercise.Square1.draw()");
    }

    public void erase() {
        System.out.println("exercise.Square1.erase()");
    }

    public void msg() {
        System.out.println("exercise.Square1.msg()");
    }
}


class Triangle1 extends Shape1 {
    public void draw() {
        System.out.println("exercise.Triangle1.draw()");
    }

    public void erase() {
        System.out.println("exercise.Triangle1.erase()");
    }

    public void msg() {
        System.out.println("exercise.Triangle1.msg()");
    }
}


class Tetrahedron extends Shape1 {
    public void draw() {
        System.out.println("exercise.Tetrahedron.draw()");
    }

    public void erase() {
        System.out.println("exercise.Tetrahedron.erase()");
    }

    public void msg() {
        System.out.println("exercise.Tetrahedron.msg()");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
public class E04_NewShapeType {
    public static void main(String args[]) {
        Shape1[] Shape1s = {new Circle1(), new Square1(), new Triangle1(), new Tetrahedron(),};
        // Make polymorphic method calls:
        for (Shape1 Shape1 : Shape1s) {
            Shape1.draw();
            Shape1.erase();
            Shape1.msg();
        }
    }
}
