package section_12;

/**
 * @Author ZhangGJ
 * @Date 2019/09/19
 */
interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}


interface Getter extends GenericGetter<Getter> {
}


public class GenericsAndReturnTypes {
    void test(Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get(); // Also the base type
    }
}
