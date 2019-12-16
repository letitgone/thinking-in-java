package section_04;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
enum Search {
    HITHER, YON
}


public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER; // Upcast
        // e.values(); // No values() in Enum
        for (Enum en : e.getClass().getEnumConstants())
            System.out.println(en);
    }
}
