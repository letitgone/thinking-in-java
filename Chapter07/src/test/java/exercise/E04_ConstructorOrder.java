package exercise;

class Base1 {
    public Base1() {
        System.out.println("exercise.Base1");
    }
}


class Derived1 extends Base1 {
    public Derived1() {
        System.out.println("exercise.Derived1");
    }
}


class Derived2 extends Derived1 {
    public Derived2() {
        System.out.println("exercise.Derived2");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E04_ConstructorOrder {
    public static void main(String args[]) {
        new Derived2();
    }
}
