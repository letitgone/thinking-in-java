package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/10/05
 */
public class DaemonSpawn implements Runnable {
    public void run() {
        while (true)
            Thread.yield();
    }
}
