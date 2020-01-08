package exercise;

class Frog2 extends Amphibian {
    public void moveInWater() {
        System.out.println("exercise.Frog swimming");
    }

    public void moveOnLand() {
        System.out.println("exercise.Frog jumping");
    }
}

/**
 * @Author ZhangGJ
 * @Date 2019/04/08
 */
public class E17_Frog2 {
    public static void main(String args[]) {
        Amphibian a = new Frog2();
        a.moveInWater();
        a.moveOnLand();
    }
}
