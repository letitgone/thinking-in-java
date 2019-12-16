package section_06;

import java.io.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(
            "/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/Chapter18/src/main/java/section_06/TestEOF.java")));
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}
