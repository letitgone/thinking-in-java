package section_06;

import static util.Range.range;

/**
 * @Author ZhangGJ
 * @Date 2019/03/23
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // Using foreach
        for (int i : range(100)) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        // An "infinite loop"
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
