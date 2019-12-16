package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/07/30
 */
public class Manipulator3 {
    private HasF obj;

    public Manipulator3(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
