/**
 * @Author ZhangGJ
 * @Date 2019/06/03
 */
class AnException extends Exception {
}


class AnotherException extends Exception {
}


public class ExerciseTen {
    public void g() throws AnException {
        throw new AnException();
    }

    public void f() throws AnotherException {
        try {
            g();
        } catch (AnException e) {
            throw new AnotherException();
        }
    }

    public static void main(String args[]) {
        ExerciseTen ce = new ExerciseTen();
        try {
            ce.f();
        } catch (AnotherException e) {
            System.out.println("Caught " + e);
        }
    }
}
