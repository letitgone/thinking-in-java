import java.util.PriorityQueue;

/**
 * @Author ZhangGJ
 * @Date 2019/05/29
 */
class Dummy {
}


public class ExerciseTwentyNine {
    public static void main(String[] args) {
        PriorityQueue<Dummy> priorityQueue = new PriorityQueue<Dummy>();
        System.out.println("Adding 1st instance...");
        priorityQueue.offer(new Dummy());
        System.out.println("Adding 2nd instance...");
        priorityQueue.offer(new Dummy());
    }
}
