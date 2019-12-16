package section_03;

/**
 * @Author ZhangGJ
 * @Date 2019/07/22
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
} ///:~


//: generics/coffee/Latte.java
class Latte extends Coffee {
} ///:~


//: generics/coffee/Mocha.java
class Mocha extends Coffee {
} ///:~


//: generics/coffee/Cappuccino.java
class Cappuccino extends Coffee {
} ///:~


//: generics/coffee/Americano.java
class Americano extends Coffee {
} ///:~


//: generics/coffee/Breve.java
class Breve extends Coffee {
}
