package section_08;


class SmallBrain {
}


final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {
    }
}


/**
 * ! class Further extends Dinosaur {}
 * error: Cannot extend final class ‘Dinosaur’
 *
 * @Author ZhangGJ
 * @Date 2019/04/09
 */
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
