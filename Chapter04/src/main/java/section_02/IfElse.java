package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/03/22
 */
public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target) {
            result = +1;
        } else if (testval < target) {
            result = -1;
        } else {
            // Match
            result = 0;
        }
    }

    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);
    }
}
