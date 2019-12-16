package section_05;

import java.util.LinkedList;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class StackL<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T v) {
        list.addFirst(v);
    }

    public T top() {
        return list.getFirst();
    }

    public T pop() {
        return list.removeFirst();
    }
}
