package exercise;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author ZhangGJ
 * @Date 2019/05/27
 */
public class ExerciseFourteen {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        for (int i = 1; i <= 10; i++) {
            it.add(i);
            if (i % 2 == 0) {
                it.previous();  //previous()方法为返回上一个元素并将指针上移一位
            }
        }
        System.out.println(list);
    }
}
