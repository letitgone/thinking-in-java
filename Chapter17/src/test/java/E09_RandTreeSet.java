import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.TreeSet;

/**
 * @Author ZhangGJ
 * @Date 2019/10/01
 */
public class E09_RandTreeSet {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        ts.addAll(CollectionData.list(new RandomGenerator.String(), 10));
        System.out.println("ts = " + ts);
    }
}
