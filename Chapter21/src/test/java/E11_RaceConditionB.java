import section_02.MyUncaughtExceptionHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
class SafeTank extends Tank {
    public synchronized void validate() {
        super.validate();
    }

    public synchronized void fill() {
        super.fill();
    }

    public synchronized void drain() {
        super.drain();
    }
}


public class E11_RaceConditionB {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        SafeTank tank = new SafeTank();
        for (int i = 0; i < 10; i++)
            exec.execute(new ConsistencyChecker(tank));
        Thread.yield();
        exec.shutdown();
    }
}
