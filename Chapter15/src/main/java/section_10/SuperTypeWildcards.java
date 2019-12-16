package section_10;

import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/08/01
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); // Error
    }
}
