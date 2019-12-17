package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/03/11
 */
public class Circle extends Shape {
    @Override
    void erase() {
        System.out.println("circle erase");
    }

    @Override
    void draw() {
        System.out.println("circle draw");
    }
}
