class Outer4 {
    class Inner {
        private int j;

        private void h() {
            System.out.println("Inner.h called");
            System.out.println("Inner.j = " + j);
        }
    }

    public void testInnerAccess() {
        Inner i = new Inner();
        i.j = 47;
        i.h();
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/05/06
 */
public class E08_OuterAccessingInner {
    public static void main(String args[]) {
        Outer4 o = new Outer4();
        o.testInnerAccess();
    }
}
