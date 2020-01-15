package exercise;

import java.util.*;

/**
 * ???
 *
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class ExerciseTwelve {
    static void reverse(List<Integer> list) {
        ListIterator<Integer> fwd = list.listIterator();
        ListIterator<Integer> rev = list.listIterator(list.size());
        int mid = list.size() >> 1;
        for (int i = 0; i < mid; i++) {
            Integer tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }

    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> dest = new LinkedList<Integer>(src);
        System.out.println("source: " + src);
        System.out.println("destination: " + dest);
        reverse(dest);
        System.out.println("source: " + src);
        System.out.println("destination: " + dest);
    }
}
