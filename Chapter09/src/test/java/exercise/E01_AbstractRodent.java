package exercise;

abstract class Rodent {
    public abstract void hop();

    public abstract void scurry();

    public abstract void reproduce();
}


class Mouse extends Rodent {
    public void hop() {
        System.out.println("exercise.Mouse hopping");
    }

    public void scurry() {
        System.out.println("exercise.Mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Mice");
    }

    public String toString() {
        return "exercise.Mouse";
    }
}


class Gerbil extends Rodent {
    public void hop() {
        System.out.println("exercise.Gerbil hopping");
    }

    public void scurry() {
        System.out.println("exercise.Gerbil scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Gerbils");
    }

    public String toString() {
        return "exercise.Gerbil";
    }
}


class Hamster extends Rodent {
    public void hop() {
        System.out.println("exercise.Hamster hopping");
    }

    public void scurry() {
        System.out.println("exercise.Hamster scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Hamsters");
    }

    public String toString() {
        return "exercise.Hamster";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class E01_AbstractRodent {
    public static void main(String args[]) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster(),};
        for (Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
