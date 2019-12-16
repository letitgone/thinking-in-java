import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/06/17
 */
abstract class RShape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();

    void rotate(int degrees) {
        System.out.println("Rotating " + this + " by " + degrees + " degrees");
    }
}


class RCircle extends RShape {
    public String toString() {
        return "Circle";
    }

    void rotate(int degrees) {
        throw new UnsupportedOperationException();
    }
}


class RSquare extends RShape {
    public String toString() {
        return "Square";
    }
}


class RTriangle extends RShape {
    public String toString() {
        return "Triangle";
    }
}


public class ExerciseFive {
    static void rotateAll(List<RShape> shapes) {
        for (RShape shape : shapes)
            if (!(shape instanceof RCircle))
                shape.rotate(45);
    }

    public static void main(String[] args) {
        List<RShape> shapes = Arrays.asList(new RCircle(), new RSquare(), new RTriangle());
        rotateAll(shapes);
    }
}
