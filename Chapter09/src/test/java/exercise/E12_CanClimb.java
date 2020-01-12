package exercise;

interface CanFight {
    void fight();
}


interface CanSwim {
    void swim();
}


interface CanFly {
    void fly();
}


interface CanClimb {
    void climb();
}


class ActionCharacter {
    public void fight() {
    }
}


class Hero2 extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {
    }

    public void fly() {
    }

    public void climb() {
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/22
 */
public class E12_CanClimb {
    static void t(CanFight x) {
        x.fight();
    }

    static void u(CanSwim x) {
        x.swim();
    }

    static void v(CanFly x) {
        x.fly();
    }

    static void z(CanClimb x) {
        x.climb();
    }

    static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero2 h = new Hero2();
        t(h); // Treat it as a exercise.CanFight
        u(h); // Treat it as a exercise.CanSwim
        v(h); // Treat it as a exercise.CanFly
        z(h); // Treat it as a exercise.CanClimb
        w(h); // Treat it as an exercise.ActionCharacter
    }
}
