import net.mindview.util.TextFile;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E17_CharactersInfo {
    public static void main(String[] args) {
        Map<Character, Integer> charsStat = new HashMap<Character, Integer>();
        for (String word : new TextFile(
            "/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/Chapter18/src/test/java/E17_CharactersInfo.java",
            "\\W+"))
            for (int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                Integer freq = charsStat.get(ch);
                charsStat.put(ch, freq == null ? 1 : freq + 1);
            }
        List<Character> keys = Arrays.asList(charsStat.keySet().toArray(new Character[0]));
        Collections.sort(keys);
        for (Character key : keys)
            System.out.println(key + " => " + charsStat.get(key));
    }
}
