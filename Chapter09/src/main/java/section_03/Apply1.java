package section_03;

import java.util.Arrays;

class Processor1 {

    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}


class Upcase1 extends Processor1 {
    @Override
    String process(Object input) { // Covariant return
        return ((String) input).toUpperCase();
    }
}


class Downcase1 extends Processor1 {
    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}


class Splitter1 extends Processor1 {
    @Override
    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String) input).split(" "));
    }
}


/**
 * important
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class Apply1 {
    public static void process(Processor1 p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase1(), s);
        process(new Downcase1(), s);
        process(new Splitter1(), s);
    }
}
