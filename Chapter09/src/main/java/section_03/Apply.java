package section_03;

/**
 * important
 * @Author ZhangGJ
 * @Date 2020/01/11 10:47
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
