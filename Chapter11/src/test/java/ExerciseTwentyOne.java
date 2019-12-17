import net.mindview.util.TextFile;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/28
 */
public class ExerciseTwentyOne {
    public static void main(String[] args) {
        Map<String, Integer> wordsStat = new HashMap<String, Integer>();
        for (String word : new TextFile("ExerciseTwentyOne.java", "\\W+")) {
            Integer freq = wordsStat.get(word);
            wordsStat.put(word, freq == null ? 1 : freq + 1);
        }
        List<String> keys = new ArrayList<String>(wordsStat.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for (String key : keys)
            System.out.println(key + " => " + wordsStat.get(key));
    }
}
