package exercise;

class Member {
    public Member(String id) {
        System.out.println("exercise.Member constructor " + id);
    }
}


class Rodent2 {
    Member m1 = new Member("r1"), m2 = new Member("r2");

    public Rodent2() {
        System.out.println("exercise.Rodent constructor");
    }

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


class Mouse2 extends Rodent2 {
    Member m1 = new Member("m1"), m2 = new Member("m2");

    public Mouse2() {
        System.out.println("exercise.Mouse constructor");
    }

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


class Gerbil2 extends Rodent2 {
    Member m1 = new Member("g1"), m2 = new Member("g2");

    public Gerbil2() {
        System.out.println("exercise.Gerbil constructor");
    }

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


class Hamster2 extends Rodent2 {
    Member m1 = new Member("h1"), m2 = new Member("h2");

    public Hamster2() {
        System.out.println("exercise.Hamster constructor");
    }

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
public class E12_RodentInitialization {
    public static void main(String args[]) {
        new Hamster2();
    }
}
