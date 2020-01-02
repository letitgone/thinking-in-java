package exercise;

/**
 * @Author ZhangGJ
 * @Date 2020/01/01 06:44
 */
public class E06_RangeTest2 {
    static boolean test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}
