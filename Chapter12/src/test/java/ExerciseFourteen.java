import section_08.Switch;

/**
 * @Author ZhangGJ
 * @Date 2019/06/03
 */
class OnOffException1 extends Exception {
}


class OnOffException2 extends Exception {
}

public class ExerciseFourteen {
    static Switch sw = new Switch();

    static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException("Inside try");
    }

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                // Code that can throw exceptions...
                f();
                sw.off();
            } catch (OnOffException1 e) {
                System.out.println("OnOffException1");
                sw.off();
            } catch (OnOffException2 e) {
                System.out.println("OnOffException2");
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println(sw);
            System.out.println("Oops! the exception '" + e + "' slipped through without turning the switch off!");
        }
    }
}
