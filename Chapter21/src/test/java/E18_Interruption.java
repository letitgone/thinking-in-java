import java.util.concurrent.TimeUnit;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
class NonTask {
    static void longMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(60);  // Waits one minute
    }
}


class Task implements Runnable {
    public void run() {
        try {
            NonTask.longMethod();
        } catch (InterruptedException ie) {
            System.out.println(ie.toString());
        } finally {
            // Any cleanup code here...
        }
    }
}


public class E18_Interruption {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Task());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        t.interrupt();
    }
}
