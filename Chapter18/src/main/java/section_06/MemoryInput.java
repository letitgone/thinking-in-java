package section_06;

import java.io.IOException;
import java.io.StringReader;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile
                .read("/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/Chapter18/src/main/java/section_06/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
}
