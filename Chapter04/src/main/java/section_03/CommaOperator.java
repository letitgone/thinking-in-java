package section_03;

/**
 * @Author ZhangGJ
 * @Date 2019/03/23
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
