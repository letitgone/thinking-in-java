package section_08;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/07/31
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }
}
