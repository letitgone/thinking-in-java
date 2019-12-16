import java.util.*;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @Author ZhangGJ
 * @Date 2019/09/04
 */
class FullStackException extends RuntimeException {
}


class FixedSizeStack2<T> {
    private int index;
    private final int size;
    private final List<T> storage;

    public FixedSizeStack2(int size) {
        storage = new ArrayList<T>(size);
        this.size = size;
    }

    public void push(T item) {
        if (index < size) {
            index++;
            storage.add(item);
        } else
            throw new FullStackException();
    }

    public T pop() {
        if (index > 0)
            return storage.get(--index);
        throw new EmptyStackException();
    }
}


public class E33_GenericCast2 {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack2<String> strings = new FixedSizeStack2<String>(SIZE);
        for (String s : "A B C D E F G H I J".split(" "))
            strings.push(s);
        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            printnb(s + " ");
        }
        print();
        try {
            strings.pop();
        } catch (EmptyStackException e) {
            print("Stack is empty");
        }
        strings = new FixedSizeStack2<String>(1);
        strings.push("A");
        try {
            strings.push("B");
        } catch (FullStackException e) {
            print("Stack is full");
        }
    }
}
