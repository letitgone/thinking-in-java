package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/07/30
 */
public class ReturnGenericType<T extends HasF> {
    private T obj;

    public ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }
}
