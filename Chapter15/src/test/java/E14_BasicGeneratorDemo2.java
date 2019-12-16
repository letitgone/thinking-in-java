import section_04.BasicGenerator;
import section_04.CountedObject;
import net.mindview.util.Generator;

/**
 * @Author ZhangGJ
 * @Date 2019/07/24
 */
public class E14_BasicGeneratorDemo2 {
    public static void main(String[] args) {
        Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
