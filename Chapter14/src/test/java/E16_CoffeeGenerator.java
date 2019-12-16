import net.mindview.util.Generator;

import java.util.Iterator;

/**
 * @Author ZhangGJ
 * @Date 2019/07/16
 */
/*class Coffee {
    public Coffee createRandom() {
        return new Coffee();
    }
}


public class E16_CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    public E16_CoffeeGenerator() {
    }

    private int size = 0;

    public E16_CoffeeGenerator(int sz) {
        size = sz;
    }

    public Coffee next() {
//        return Coffee.createRandom();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return E16_CoffeeGenerator.this.next();
        }

        public void remove() {
        } // Not implemented
    }


    ;

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        for (Coffee c : new E16_CoffeeGenerator(10))
            System.out.println(c);
    }
}*/



/*package typeinfo.coffee2;
    import java.util.*;
    import typeinfo.factory.Factory;
@SuppressWarnings("unchecked")
public class Coffee {
    private static int counter = 0;
    private int id = counter++;
    private static
    List<Factory<? extends Coffee>> coffeeFactories =
        Arrays.asList(new Americano.Factory(),
            new Breve.Factory(), new Latte.Factory(),
            new Mocha.Factory(), new Cappucino.Factory());
    private static Random rand = new Random(47);
    public static Coffee createRandom() {
        int n = rand.nextInt(coffeeFactories.size());
        return coffeeFactories.get(n).create();
    }
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
} ///:~
//: typeinfo/coffee2/Americano.java
                                              310
                                                  Thinking in Java, 4th Edition Annotated Solution Guide
                                                  package typeinfo.coffee2;
public class Americano extends Coffee {
    public static class Factory
        implements typeinfo.factory.Factory<Americano> {
        public Americano create() { return new Americano(); }
    }
} ///:~
//: typeinfo/coffee2/Breve.java
package typeinfo.coffee2;
public class Breve extends Coffee {
    public static class Factory
        implements typeinfo.factory.Factory<Breve> {
        public Breve create() { return new Breve(); }
    }
} ///:~
//: typeinfo/coffee2/Cappucino.java
package typeinfo.coffee2;
public class Cappucino extends Coffee {
    public static class Factory
        implements typeinfo.factory.Factory<Cappucino> {
        public Cappucino create() { return new Cappucino(); }
    }
} ///:~
//: typeinfo/coffee2/Latte.java
package typeinfo.coffee2;
public class Latte extends Coffee {
    public static class Factory
        implements typeinfo.factory.Factory<Latte> {
        public Latte create() { return new Latte(); }
    }
} ///:~
//: typeinfo/coffee2/Mocha.java
package typeinfo.coffee2;
public class Mocha extends Coffee {
    public static class Factory
        implements typeinfo.factory.Factory<Mocha> {
        public Mocha create() { return new Mocha(); }
    }
}*/
