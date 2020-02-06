package section_06;

import java.io.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile
                .read(
                    "/Users/zhanggengjia/Downloads/IntellijProject/thinking-in-java/Chapter18/src/main/java/section_06/FormattedMemoryInput.java")
                .getBytes()));
            while (true)
                System.out.print((char) in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
