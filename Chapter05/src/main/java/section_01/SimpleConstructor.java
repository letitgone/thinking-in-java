package section_01;

class Rock {
    Rock() {
        System.out.println("Rock ");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/03/26
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
