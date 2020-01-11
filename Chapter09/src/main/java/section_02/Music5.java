package section_02;


import first.Note;

interface Instrument {
    // Compile-time constant:
    // static & final
    int VALUE = 5;

    // Cannot have method definitions:
    // Automatically public
    void play(Note n);

    void adjust();
}


class Wind implements Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


class Stringed implements Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}


class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class Music5 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra =
            {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }
}
