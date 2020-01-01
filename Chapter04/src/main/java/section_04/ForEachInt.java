package section_04;

import static net.mindview.util.Range.range;

/**
 * @Author ZhangGJ
 * @Date 2019/03/23
 */
public class ForEachInt {
    public static void main(String[] args) {
        // 0...9
        for (int i : range(100)) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 5...9
        for (int i : range(5, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 5...20 step 3
        for (int i : range(5, 20, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
