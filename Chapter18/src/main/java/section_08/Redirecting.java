package section_08;

import java.io.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(
                "/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/Chapter18/src/main/java/section_08/Redirecting.java"));
        PrintStream out =
                new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null)
            System.out.println(s);
        out.close(); // Remember this!
        System.setOut(console);
    }
}
