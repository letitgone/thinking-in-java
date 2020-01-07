package section_04;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
    void doh(Milhouse m){
        System.out.println("234");
    }
}


class Milhouse {
}


class Bart extends Homer {
    @Override
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/08
 */
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
