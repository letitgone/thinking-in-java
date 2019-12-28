package upcasting;

/**
 * @Author ZhangGJ
 * @Date 2019/12/27 06:21
 */
public class Line extends Shape {

    @Override
    public void draw() {
        System.out.println("Line draw");
    }

    @Override
    public void erase() {
        System.out.println("Line erase");
    }
}
