package section_04;

import static util.Range.range;

/**
 * @Author ZhangGJ
 * @Date 2019/03/23
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(100)) // 0..9
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(5, 10)) // 5..9
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(5, 20, 3)) // 5..20 step 3
            System.out.print(i + " ");
        System.out.println();
    }
}
