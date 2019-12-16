package section_04;

/**
 * @Author ZhangGJ
 * @Date 2019/07/24
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(new CountedObject());
        }
    }
}
