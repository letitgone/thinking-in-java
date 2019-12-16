import section_03.Fibonacci;

import java.util.Iterator;

/**
 * @Author ZhangGJ
 * @Date 2019/07/22
 */
class IterableFibonacci implements Iterable<Integer> {
    private Fibonacci fib = new Fibonacci();
    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                --n;
                return fib.next();
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}


public class E07_IterableFibonacci2 {
    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
