import net.mindview.util.BinaryFile;

import java.io.IOException;
import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E19_BytesInfo {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> bytesStat = new HashMap<Byte, Integer>();
        for (Byte bt : BinaryFile.read(
            "/Users/zhanggengjia/Downloads/IntellijProject/thinking-in-java/Chapter18/target/test-classes/E19_BytesInfo.class")) {
            Integer freq = bytesStat.get(bt);
            bytesStat.put(bt, freq == null ? 1 : freq + 1);
        }
        List<Byte> keys = new ArrayList<Byte>(bytesStat.keySet());
        Collections.sort(keys);
        for (Byte key : keys)
            System.out.println(key + " => " + bytesStat.get(key));
    }
}
