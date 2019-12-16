package section_02;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/06/13
 */
class Candy {
    static {
        print("Loading Candy");
    }
}


class Gum {
    static {
        print("Loading Gum");
    }
}


class Cookie {
    static {
        print("Loading Cookie");
    }
}


public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("section_02.Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn’t find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }
}
