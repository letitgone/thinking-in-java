import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/06/17
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


public class ExerciseSeven {
    public static void main(String[] args) throws Exception {
        for (String arg : args)
            Class.forName(arg);
    }
}
