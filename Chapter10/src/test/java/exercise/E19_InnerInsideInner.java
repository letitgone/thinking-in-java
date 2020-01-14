package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/05/14
 */
public class E19_InnerInsideInner {
    class Inner1 {
        class Inner2 {
            void f() {
            }
        }

        Inner2 makeInner2() {
            return new Inner2();
        }
    }

    Inner1 makeInner1() {
        return new Inner1();
    }

    static class Nested1 {
        static class Nested2 {
            void f() {
            }
        }

        void f() {
        }
    }

    public static void main(String args[]) {
        new E19_InnerInsideInner.Nested1().f();
        new E19_InnerInsideInner.Nested1.Nested2().f();
        E19_InnerInsideInner x1 = new E19_InnerInsideInner();
        E19_InnerInsideInner.Inner1 x2 = x1.makeInner1();
        E19_InnerInsideInner.Inner1.Inner2 x3 = x2.makeInner2();
        x3.f();
    }
}
/**
 * The class names produced are:
 * exercise.E19_InnerInsideInner.class
 * exercise.E19_InnerInsideInner$Inner1.class
 * exercise.E19_InnerInsideInner$Inner1$Inner2.class
 * exercise.E19_InnerInsideInner$Nested1.class
 * exercise.E19_InnerInsideInner$Nested1$Nested2.class
 */
