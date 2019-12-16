package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}
