package section_08;

/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}


class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
}
