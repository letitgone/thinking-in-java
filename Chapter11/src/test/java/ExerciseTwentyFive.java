import net.mindview.util.TextFile;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/28
 */
public class ExerciseTwentyFive {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat = new HashMap<String, ArrayList<Integer>>();
        int wordCount = 0;
        for (String word : new TextFile("ExerciseTwentyFive.java", "\\W+")) {
            ArrayList<Integer> loc = stat.get(word);
            if (loc == null) {
                loc = new ArrayList<Integer>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }
        System.out.println(stat);
    }
}
