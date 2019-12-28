import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class E12_GeneratedDArray {
    public static void main(String[] args) {
        double[] d =
            ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 15));
        System.out.println(Arrays.toString(d));
    }
}
