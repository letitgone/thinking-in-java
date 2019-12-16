package section_02;

import net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(CollectionData.list( // Convenience method
            new RandomGenerator.String(9), 10)));
        System.out.println(
            new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));
    }
}
