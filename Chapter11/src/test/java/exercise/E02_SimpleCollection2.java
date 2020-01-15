package exercise;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class E02_SimpleCollection2 {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            // Autoboxing
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
