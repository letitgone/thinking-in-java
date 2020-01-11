package exercise;

class Glyph {
    void draw() {
        System.out.println("exercise.Glyph.draw()");
    }

    Glyph() {
        System.out.println("exercise.Glyph() before draw()");
        draw();
        System.out.println("exercise.Glyph() after draw()");
    }
}


class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("exercise.RoundGlyph.exercise.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("exercise.RoundGlyph.draw(), radius = " + radius);
    }
}


class RectangularGlyph extends Glyph {
    private int width = 4;
    private int height = 5;

    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println(
            "exercise.RectangularGlyph.exercise.RectangularGlyph(), width = " + width + ", height = " + height);
    }

    void draw() {
        System.out.println("exercise.RectangularGlyph.draw(), area = " + width * height);
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/15
 */
public class E15_PolyConstructors2 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2, 2);
    }
}
