package section_07;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @Author ZhangGJ
 * @Date 2019/10/01
 */
public class DequeTest {
    static void fillTest(Deque<Integer> deque) {
        for (int i = 20; i < 27; i++)
            deque.addFirst(i);
        for (int i = 50; i < 55; i++)
            deque.addLast(i);
    }

    public static void main(String[] args) {
        Deque<Integer> di = new Deque<Integer>();
        fillTest(di);
        print(di);
        while (di.size() != 0)
            printnb(di.removeFirst() + " ");
        print();
        fillTest(di);
        while (di.size() != 0)
            printnb(di.removeLast() + " ");
    }
}
