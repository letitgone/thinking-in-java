package section_04;

import static net.mindview.util.Print.print;

class Letter {
    char c;
}


/**
 * important
 * 方法调用中的别名问题
 * @Author ZhangGJ
 * @Date 2019/03/18
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}
