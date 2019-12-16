import section_04.Generators;
import net.mindview.util.Generator;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/07/29
 */
class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {
    }

    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}


class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator = new Generator<BigFish>() {
        public BigFish next() {
            return new BigFish();
        }
    };
}


public class E18_OceanLife {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eat " + lf);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<LittleFish> littleF = new LinkedList<LittleFish>();
        Generators.fill(littleF, LittleFish.generator(), 15);
        List<BigFish> bigF = new ArrayList<BigFish>();
        Generators.fill(bigF, BigFish.generator, 4);
        for (LittleFish lf : littleF)
            eat(bigF.get(rand.nextInt(bigF.size())), lf);
    }
}
