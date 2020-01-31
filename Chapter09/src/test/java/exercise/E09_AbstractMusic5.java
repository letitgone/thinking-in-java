package exercise;

import section_01.Note;

abstract class Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    // Forces implementation in derived class:
    public abstract String toString();
}


class Wind extends Instrument {
    public String toString() {
        return "exercise.Wind";
    }
}


class Percussion extends Instrument {
    public String toString() {
        return "exercise.Percussion";
    }
}


class Stringed extends Instrument {
    public String toString() {
        return "exercise.Stringed";
    }
}


class Brass extends Wind {
    public String toString() {
        return "exercise.Brass";
    }
}


class Woodwind extends Wind {
    public String toString() {
        return "exercise.Woodwind";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class E09_AbstractMusic5 {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra =
            {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }
}
