package exercise;

import java.util.*;
import java.util.Map.Entry;

/**
 * important
 * 遍历map，使用entrySet
 * @Author ZhangGJ
 * @Date 2019/05/28
 */
public class E17_GerbilMap {
    public static void main(String args[]) {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("Fuzzy", new Gerbil(1));
        map.put("Spot", new Gerbil(2));
        map.put("Joe", new Gerbil(3));
        map.put("Ted", new Gerbil(4));
        map.put("Heather", new Gerbil(5));
        System.out.println(map.values());
        Iterator<Entry<String, Gerbil>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Gerbil> entry = it.next();
            System.out.print(entry.getKey() + ": ");
            entry.getValue().hop();
        }
    }
}
