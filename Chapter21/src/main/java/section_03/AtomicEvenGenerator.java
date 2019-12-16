package section_03;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author ZhangGJ
 * @Date 2019/10/06
 */
public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenValue = new AtomicInteger(0);

    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
