import section_02.LiftOff;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
public class E08_MoreBasicDaemonThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.setDaemon(true);
            t.start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
