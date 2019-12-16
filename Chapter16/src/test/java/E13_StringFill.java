import net.mindview.util.CountingGenerator;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class E13_StringFill {
    public static void main(String[] args) {
        String s = new CountingGenerator.String(15).next();
        System.out.println(s);
    }
}
