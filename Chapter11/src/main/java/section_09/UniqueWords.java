package section_09;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/27
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(new TextFile("/Users/zhanggj/Downloads/idea_projects/thinking-in-java/Chapter11/src/main/java/section_09/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
