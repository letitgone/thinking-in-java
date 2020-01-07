package exercise;

class A extends E05_SimpleInheritance {
    public A() {
        System.out.println("Constructor exercise.A");
    }
}


class B {
    public B() {
        System.out.println("Constructor exercise.B");
    }
}


class C extends A {
    B b = new B();
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E05_SimpleInheritance {
    public static void main(String[] args) {
        new C();
    }
}
