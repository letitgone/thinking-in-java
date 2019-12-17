import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/03/19
 */
public class E07_CoinFlipping {
    public static void main(String[] args) {
        Random rand = new Random(47);
        boolean flip = rand.nextBoolean();
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
