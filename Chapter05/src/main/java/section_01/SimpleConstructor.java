package section_01;

/**
 * @Author ZhangGJ
 * @Date 2019/03/26
 */
class Rock {
    Rock() {
        System.out.println("Rock ");
    }
}


public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
