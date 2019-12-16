package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
