import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class E10_ArrayOfGenerics2 {
    public static void main(String[] args) {
        ArrayList<List<String>> ls = new ArrayList<List<String>>();
        ls.add(new ArrayList<String>());
        // Compile-time checking produces an error:
        //! ls.add(new ArrayList<Integer>());
        ls.get(0).add("Array of Generics");
        System.out.println(ls.toString());
    }
}
