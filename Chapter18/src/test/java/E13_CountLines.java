import java.io.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E13_CountLines {
    static String file = "E13_CountLines.out";

    public static void main(String[] args) throws IOException {
        // LineNumberReader is inherited from
        // BufferedReader so we don't need to
        // explicitly buffer it:
        LineNumberReader in = new LineNumberReader(new FileReader(
                "/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/Chapter18/src/test/java/E13_CountLines.java"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        String s;
        while ((s = in.readLine()) != null)
            out.println(in.getLineNumber() + ": " + s);
        out.close();
        // Show the stored file:
        System.out.println(E07_FileIntoList.read(file));
    }
}
