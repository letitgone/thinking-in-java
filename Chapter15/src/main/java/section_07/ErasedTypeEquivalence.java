package section_07;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/07/29
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
