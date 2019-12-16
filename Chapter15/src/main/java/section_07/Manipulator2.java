package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/07/30
 */
public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
