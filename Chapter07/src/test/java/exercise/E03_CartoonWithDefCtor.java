package exercise;

class eat {
    public eat() {
        System.out.println("I'm exercise.hungry...");
    }
}


class noodle extends eat {
    public noodle() {
        System.out.println("I want to exercise.eat exercise.noodle...");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E03_CartoonWithDefCtor extends noodle {
    public static void main(String[] args) {
        E03_CartoonWithDefCtor e = new E03_CartoonWithDefCtor();
    }
}
