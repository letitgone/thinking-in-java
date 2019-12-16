/**
 * @Author ZhangGJ
 * @Date 2019/07/31
 */
interface Low {
    void c();

    void d();
}


class TopLowImpl implements Top, Low {
    public void a() {
        System.out.println("Top::a()");
    }

    public void b() {
        System.out.println("Top::b()");
    }

    public void c() {
        System.out.println("Low::c()");
    }

    public void d() {
        System.out.println("Low::d()");
    }
}


public class E25_Bounds {
    static <T extends Top> void top(T obj) {
        obj.a();
        obj.b();
    }

    static <T extends Low> void low(T obj) {
        obj.c();
        obj.d();
    }

    public static void main(String[] args) {
        TopLowImpl tli = new TopLowImpl();
        top(tli);
        low(tli);
    }
}
