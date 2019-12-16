package section_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
