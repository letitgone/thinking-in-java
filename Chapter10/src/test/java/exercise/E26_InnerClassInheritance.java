package exercise;

class WithNonDefault {
    class Inner {
        int i;

        public Inner(int i) {
            this.i = i;
        }

        public Inner() {
            i = 47;
        }

        public void f() {
            System.out.println("Inner.f");
        }
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/05/23
 */
public class E26_InnerClassInheritance {
    class Inner2 extends WithNonDefault.Inner {
        // Won't compile -- exercise.WithNonDefault not available:
        //! public Inner2(int i) {
        //!   super(i);
        //! }
        public Inner2(WithNonDefault wnd, int i) {
            wnd.super(i);
        }

        public void f() {
            System.out.println("Inner2.f");
            super.f();
        }
    }

    public static void main(String args[]) {
        WithNonDefault wnd = new WithNonDefault();
        E26_InnerClassInheritance ici = new E26_InnerClassInheritance();
        Inner2 i2 = ici.new Inner2(wnd, 47);
        i2.f();
    }
}
