package section_10;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/08/01
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0); // No warning
        System.out.println(flist.contains(new Apple())); // Argument is ‘Object’
        System.out.println(flist.indexOf(new Apple())); // Argument is ‘Object’
    }
}
