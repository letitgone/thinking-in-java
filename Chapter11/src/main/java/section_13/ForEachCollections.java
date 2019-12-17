package section_13;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/30
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs)
            System.out.print("‘" + s + "‘ ");
    }
}
