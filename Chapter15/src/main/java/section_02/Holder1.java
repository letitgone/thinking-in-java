package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/07/22
 */
class Automobile {
}


public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}
