package upcasting;

/**
 * @Author ZhangGJ
 * @Date 2019/12/27 06:21
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase");
    }
}
