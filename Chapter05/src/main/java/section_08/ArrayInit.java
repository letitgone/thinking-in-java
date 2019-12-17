package section_08;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {new Integer(1), new Integer(2), 3, // Autoboxing
        };
        Integer[] b = new Integer[] {new Integer(1), new Integer(2), 3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
