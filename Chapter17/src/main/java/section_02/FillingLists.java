package section_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}


public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list =
                new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
    }
}
