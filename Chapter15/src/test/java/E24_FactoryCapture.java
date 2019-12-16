import java.util.*;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/07/30
 */
class FactoryCapture {
    Map<String, FactoryI<?>> factories = new HashMap<String, FactoryI<?>>();

    public Object createNew(String factoryname, int arg) {
        FactoryI<?> f = factories.get(factoryname);
        try {
            return f.create(arg);
        } catch (NullPointerException e) {
            print("Not a registered factoryname: " + factoryname);
            return null;
        }
    }

    public void addFactory(String factoryname, FactoryI<?> factory) {
        factories.put(factoryname, factory);
    }
}


public class E24_FactoryCapture {
    public static void main(String[] args) {
        FactoryCapture fc = new FactoryCapture();
        fc.addFactory("Integer", new IntegerFactory());
        fc.addFactory("Widget", new Widget.Factory());
        print(fc.createNew("Integer", 1));
        print(fc.createNew("Widget", 2));
        fc.createNew("Product", 3);
    }
}
