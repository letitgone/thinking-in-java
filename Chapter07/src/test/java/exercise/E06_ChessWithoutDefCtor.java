package exercise;

import section_02.BoardGame;

class ChessWithoutDefCtor extends BoardGame {
    ChessWithoutDefCtor () {
        super(12);
        System.out.println("exercise.ChessWithoutDefCtor constructor");
    }
}

/**
 * @Author ZhangGJ
 * @Date 2020/01/07 07:38
 */
public class E06_ChessWithoutDefCtor {
    public static void main(String args[]) {
        new ChessWithoutDefCtor();
    }
}
