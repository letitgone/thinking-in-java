package section_02;

import java.util.concurrent.ThreadFactory;

/**
 * @Author ZhangGJ
 * @Date 2019/10/05
 */
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
