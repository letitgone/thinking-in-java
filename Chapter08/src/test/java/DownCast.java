class Test {
    public void a() {

    }

    public void c() {

    }
}


/**
 * @Author ZhangGJ
 * @Date 2020/01/11 08:17
 */
public class DownCast extends Test {

    @Override
    public void a() {
        System.out.println("123");
    }

    public void b() {
        System.out.println("456");
    }

    public static void main(String[] args) {
        Test a = new DownCast();
        a.a();
        a.c();
        ((DownCast) a).b();
    }
}
