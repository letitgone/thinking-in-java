package exercise;

import java.util.*;

class Rodent {
    public void hop() {
        System.out.println("Rodent hopping");
    }

    public void scurry() {
        System.out.println("Rodent scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Rodents");
    }

    public String toString() {
        return "Rodent";
    }
}


class Mouse extends Rodent {
    public void hop() {
        System.out.println("Mouse hopping");
    }

    public void scurry() {
        System.out.println("Mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Mice");
    }

    public String toString() {
        return "Mouse";
    }
}


class Hamster extends Rodent {
    public void hop() {
        System.out.println("Hamster hopping");
    }

    public void scurry() {
        System.out.println("Hamster scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Hamsters");
    }

    public String toString() {
        return "Hamster";
    }
}

/**
 * @Author ZhangGJ
 * @Date 2019/05/25
 */
public class E10_RodentIterator {
    public static void main(String args[]) {
        ArrayList<Rodent> rodents =
            new ArrayList<Rodent>(Arrays.asList(new Rodent(), new Mouse(), new Hamster()));
        Rodent r;
        for (Iterator<Rodent> it = rodents.iterator(); it.hasNext(); ) {
            r = it.next();
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
