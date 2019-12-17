package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/07/29
 */
class Manipulator<T> {
    //class Manipulator<T extends HasF> {  // Solution
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    // Error: cannot find symbol: method f():
    public void manipulate() {
        //        obj.f();  // error！
    }
}


public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
}
