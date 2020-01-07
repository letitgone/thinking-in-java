package section_02;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/07
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
