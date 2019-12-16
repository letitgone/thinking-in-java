package section_04;

import net.mindview.util.Generator;

/**
 * @Author ZhangGJ
 * @Date 2019/07/24
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
