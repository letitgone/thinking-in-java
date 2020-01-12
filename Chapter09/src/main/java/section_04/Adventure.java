package section_04;

interface CanFight {
    void fight();
}


interface CanSwim {
    void swim();
}


interface CanFly {
    void fly();
}


class ActionCharacter {
    public void fight() {
    }
}


class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    @Override
    public void swim() {
    }

    @Override
    public void fly() {
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/17
 */
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        // Treat it as a CanFight
        t(h);
        // Treat it as a CanSwim
        u(h);
        // Treat it as a CanFly
        v(h);
        // Treat it as an ActionCharacter
        w(h);
    }
}
