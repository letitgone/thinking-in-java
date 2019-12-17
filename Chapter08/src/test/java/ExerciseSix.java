import section_01.Note;

/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
    }
}


class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }
}


class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }
}


class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }
}


class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Brass.adjust()");
    }
}


class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}


public class ExerciseSix {
    static Instrument[] orchestra =
            {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};

    public static void printAll(Instrument[] orch) {
        for (Instrument i : orch)
            System.out.println(i);
    }

    public static void main(String args[]) {
        printAll(orchestra);
    }
}
