/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class TwoMethods {
    public void m1() {
        System.out.println("Inside m1, calling m2");
        m2();
    }

    public void m2() {
        System.out.println("Inside m2");
    }
}


class Inherited extends TwoMethods {
    public void m2() {
        System.out.println("Inside Inherited.m2");
    }
}


public class ExerciseTen {
    public static void main(String args[]) {
        TwoMethods x = new Inherited();
        x.m1();
    }
}
