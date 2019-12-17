/**
 * @Author ZhangGJ
 * @Date 2019/04/08
 */
class Amphibian {
    public void moveInWater() {
        System.out.println("Moving in Water");
    }

    public void moveOnLand() {
        System.out.println("Moving on Land");
    }
}


class Frog extends Amphibian {
    public void moveInWater() {
        System.out.println("Frog swimming");
    }

    public void moveOnLand() {
        System.out.println("Frog jumping");
    }
}


public class ExerciseSixteen {
    public static void main(String args[]) {
        Amphibian a = new Frog();
        a.moveInWater();
        a.moveOnLand();
    }
}
