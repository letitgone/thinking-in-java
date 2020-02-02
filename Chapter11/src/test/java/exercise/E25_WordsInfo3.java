package exercise;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/28
 */
public class E25_WordsInfo3 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat = new HashMap<>();
        int wordCount = 0;
        for (String word : new TextFile("E25_WordsInfo3.java", "\\W+")) {
            ArrayList<Integer> loc = stat.get(word);
            if (loc == null) {
                loc = new ArrayList<>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }
        System.out.println(stat);
    }
}
