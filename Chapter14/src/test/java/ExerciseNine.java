import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/06/17
 */
interface Iface {
    int i = 47;

    void f();
}


class Base implements Iface {
    String s;
    double d;

    public void f() {
        System.out.println("Base.f");
    }
}


class Composed {
    Base b;
}


class Derived extends Base {
    Composed c;
    String s;
}


public class ExerciseNine {
    static Set<Class<?>> alreadyDisplayed = new HashSet<Class<?>>();

    static void printClasses(Class<?> c) {
        // getSuperclass() returns null on Object:
        if (c == null)
            return;
        print(c.getName());
        Field[] fields = c.getDeclaredFields();
        if (fields.length != 0)
            print("Fields:");
        for (Field fld : fields) {
            print("   " + fld);
        }
        for (Field fld : fields) {
            Class<?> k = fld.getType();
            if (!alreadyDisplayed.contains(k)) {
                printClasses(k);
                alreadyDisplayed.add(k);
            }
        }
        // Produces the interfaces that this class
        // implements:
        for (Class<?> k : c.getInterfaces()) {
            print("Interface: " + k.getName());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }

    public static void main(String args[]) throws Exception {
        for (int i = 0; i < args.length; i++) {
            print("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1)
                System.out.println("==================");
        }
    }
}
