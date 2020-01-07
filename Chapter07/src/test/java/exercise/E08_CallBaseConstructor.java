package exercise;

class hungry {
    public hungry(String s) {
        System.out.println(s);
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class E08_CallBaseConstructor extends hungry {
    public E08_CallBaseConstructor() {
        super("I'm very exercise.hungry!!!");
        System.out.println("...");
    }

    public E08_CallBaseConstructor(String s) {
        super("I'm very exercise.hungry!!!");
        System.out.println(":");
    }

    public static void main(String[] args) {
        new E08_CallBaseConstructor();
        new E08_CallBaseConstructor("I want to exercise.eat exercise.noodle!");
    }
}
