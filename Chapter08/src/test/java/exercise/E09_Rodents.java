package exercise;

class Rodent {
    public void hop() {
        System.out.println("exercise.Rodent hopping");
    }

    public void scurry() {
        System.out.println("exercise.Rodent scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Rodents");
    }

    public String toString() {
        return "exercise.Rodent";
    }
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
 * @Date 2019/04/11
 */
public class E09_Rodents {
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
