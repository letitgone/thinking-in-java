package section_06;

/**
 * @Author ZhangGJ
 * @Date 2019/03/15
 */
public class StaticTest {
    static int i = 47;
}


class Test2 {
    int i = 48;
}


class Test1 {
    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        System.out.println(StaticTest.i);
        System.out.println(staticTest1 + "---" + staticTest2);
        Test2 test2 = new Test2();
        Test2 test21 = new Test2();
        System.out.println(test2.i);
        System.out.println(test21.i);
        System.out.println(test2 + "---" + test21);
    }
}
