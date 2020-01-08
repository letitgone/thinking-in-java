import third.Sandwich;

/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
interface FastFood {
    void rushOrder();

    void gobble();
}


class FastSandwich extends Sandwich implements FastFood {
    public void rushOrder() {
        System.out.println("Rushing your sandwich order");
    }

    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}


public class ExerciseEight {
    public static void main(String args[]) {
        FastSandwich burger = new FastSandwich();
        System.out.println("Fries with that?");
        System.out.println("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}
