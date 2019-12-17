/**
 * @Author ZhangGJ
 * @Date 2019/05/14
 */
public class ExerciseNineteen {
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
        new ExerciseNineteen.Nested1().f();
        new ExerciseNineteen.Nested1.Nested2().f();
        ExerciseNineteen x1 = new ExerciseNineteen();
        ExerciseNineteen.Inner1 x2 = x1.makeInner1();
        ExerciseNineteen.Inner1.Inner2 x3 = x2.makeInner2();
        x3.f();
    }
}
