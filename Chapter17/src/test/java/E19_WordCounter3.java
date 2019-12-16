import net.mindview.util.TextFile;
import section_09.SimpleHashMap;

import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
public class E19_WordCounter3 {
    public static void main(String[] args) {
        List<String> words = new TextFile("E12_MapsDemo.java", "\\W+");
        SimpleHashMap<String, Integer> map = new SimpleHashMap<String, Integer>();
        for (String word : words) {
            Integer freq = map.get(word);
            map.put(word, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
