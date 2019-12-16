import java.util.PriorityQueue;
import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/10/01
 */
class Item implements Comparable<Item> {
    private static final Random rnd = new Random(47);
    private Integer priority = rnd.nextInt(101);

    public int compareTo(Item arg) {
        return priority < arg.priority ? -1 : priority == arg.priority ? 0 : 1;
    }

    public String toString() {
        return Integer.toString(priority);
    }
}


public class E11_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Item> queue = new PriorityQueue<Item>();
        for (int i = 0; i < 10; i++)
            queue.add(new Item());
        Item item;
        while ((item = queue.poll()) != null)
            System.out.println(item);
    }
}
