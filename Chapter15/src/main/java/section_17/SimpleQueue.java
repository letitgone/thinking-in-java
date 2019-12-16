package section_17;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
