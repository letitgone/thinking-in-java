import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/29
 */
public class ExerciseTwentyEight {
    static Random rand = new Random(47);

    public static void printQ(Queue<?> queue) {
        for (Object data = queue.poll(); data != null; data = queue.poll()) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextDouble());
        }
        printQ(priorityQueue);
    }
}
