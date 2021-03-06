package exercise;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class E08_GerbilIterator {
    public static void main(String args[]) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (Iterator<Gerbil> it = gerbils.iterator(); it.hasNext(); it.next().hop())
            ;
    }
}
