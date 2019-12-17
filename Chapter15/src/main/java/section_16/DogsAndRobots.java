package section_16;

import typeinfo.pets.Dog;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
interface Performs {
    void speak();

    void sit();
} ///:~


//: generics/DogsAndRobots.java
// No latent typing in Java
class PerformingDog extends Dog implements Performs {
    public void speak() {
        print("Woof!");
    }

    public void sit() {
        print("Sitting");
    }

    public void reproduce() {
    }
}


class Robot implements Performs {
    public void speak() {
        print("Click!");
    }

    public void sit() {
        print("Clank!");
    }

    public void oilChange() {
    }
}


class Communicate {
    public static <T extends Performs> void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}


public class DogsAndRobots {
    public static void main(String[] args) {
        PerformingDog d = new PerformingDog();
        Robot r = new Robot();
        Communicate.perform(d);
        Communicate.perform(r);
    }
}
