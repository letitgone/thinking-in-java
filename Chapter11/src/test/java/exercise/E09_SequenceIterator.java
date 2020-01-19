package exercise;

import java.util.*;

class Sequence2 {
    private Object[] items;
    private int next;

    public Sequence2(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceIterator implements Iterator<Object> {
        private int i;

        public boolean hasNext() {
            return i < items.length;
        }

        public Object next() {
            if (hasNext())
                return items[i++];
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Object> iterator() {
        return new SequenceIterator();
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class E09_SequenceIterator {
    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        for (Iterator<Object> it = sequence.iterator(); it.hasNext(); )
            System.out.print(it.next() + " ");
    }
}
