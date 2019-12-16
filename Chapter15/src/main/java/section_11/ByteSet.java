package section_11;

import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/09/04
 */
public class ByteSet {
    Byte[] possibles = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));
    // But you can’t do this:
    // Set<Byte> mySet2 = new HashSet<Byte>(
    //   Arrays.<Byte>asList(1,2,3,4,5,6,7,8,9));
}
