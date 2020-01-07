package exercise;

class A2 {
    public A2(String s) {
        System.out.println("exercise.A2(): " + s);
    }
}


class B2 {
    public B2(String s) {
        System.out.println("2B(): " + s);
    }
}


class C2 extends A2 {
    B2 b;

    public C2(String s) {
        super(s);
        b = new B2(s);
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E07_SimpleInheritance2 {
    public static void main(String args[]) {
        new C2("Init string");
    }
}
