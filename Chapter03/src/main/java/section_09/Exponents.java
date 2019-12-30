package section_09;

/**
 * @Author ZhangGJ
 * @Date 2019/03/20
 */
public class Exponents {
    /**
     * Uppercase and lowercase 'e' are the same
     * @param args
     */
    public static void main(String[] args) {
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        // 'd' is optional
        double expDouble = 47e47d;
        // Automatically double
        double expDouble2 = 47e47;
        System.out.println(expDouble);
    }
}
