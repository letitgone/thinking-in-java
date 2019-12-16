package section_08;

import java.io.PrintWriter;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, world");
    }
}
