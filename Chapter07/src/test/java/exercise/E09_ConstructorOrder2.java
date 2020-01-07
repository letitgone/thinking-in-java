package exercise;

class Component1 {
    public Component1() {
        System.out.println("exercise.Component1");
    }
}


class Component2 {
    public Component2() {
        System.out.println("exercise.Component2");
    }
}


class Component3 {
    public Component3() {
        System.out.println("exercise.Component3");
    }
}


class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Root() {
        System.out.println("exercise.Root");
    }
}


class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Stem() {
        System.out.println("exercise.Stem");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E09_ConstructorOrder2 {
    public static void main(String args[]) {
        new Stem();
    }
}
