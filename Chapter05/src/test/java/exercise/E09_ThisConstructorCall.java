package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/04/01
 */
public class E09_ThisConstructorCall {
    E09_ThisConstructorCall() {
        this("hi");
        System.out.println("No-arg constructor");
    }

    E09_ThisConstructorCall(String s) {
        System.out.println("One-arg constructor: " + s);
    }

    public static void main(String[] args) {
        E09_ThisConstructorCall e = new E09_ThisConstructorCall();
        System.out.println("end");
    }
}
