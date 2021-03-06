package exercise;

class Outer5 {
    private class Inner implements SimpleInterface {
        public void f() {
            System.out.println("exercise.Outer5.Inner.f");
        }
    }

    public SimpleInterface get() {
        return new Inner();
    }

    public Inner get2() {
        return new Inner();
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/05/07
 */
public class E11_HiddenInnerClass {
    public static void main(String args[]) {
        Outer5 out = new Outer5();
        SimpleInterface si = out.get();
        si = out.get2();
        // Won't compile -- 'Inner' not visible:
        //! Inner i1 = out.get2();
        //! Inner i2 = (Inner)si;
    }
}
