package exercise;


/**
 * @Author ZhangGJ
 * @Date 2019/03/17
 */
public class E07_Incrementable {

    static class StaticTest {
        static int i = 47;
    }

    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        E07_Incrementable.increment();
    }
}
