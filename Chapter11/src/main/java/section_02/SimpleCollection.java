package section_02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author ZhangGJ
 * @Date 2019/05/24
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
