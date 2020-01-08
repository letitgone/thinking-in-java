package exercise;

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
public class E16_Frog {
    public static void main(String args[]) {
        Amphibian a = new Frog();
        a.moveInWater();
        a.moveOnLand();
    }
}
