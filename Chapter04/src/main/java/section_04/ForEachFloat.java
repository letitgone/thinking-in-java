package section_04;

import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2019/03/23
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
