package exercise;

import section_01.Note;


class Instrument {
    void play(Note n) {
        System.out.println("exercise.Instrument.play() " + n);
    }

    public String toString() {
        return "exercise.Instrument";
    }

    void adjust() {
    }
}


class Wind extends Instrument {
    void play(Note n) {
        System.out.println("exercise.Wind.play() " + n);
    }

    public String toString() {
        return "exercise.Wind";
    }
}


class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("exercise.Percussion.play() " + n);
    }

    public String toString() {
        return "exercise.Percussion";
    }
}


class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("exercise.Stringed.play() " + n);
    }

    public String toString() {
        return "exercise.Stringed";
    }
}


class Brass extends Wind {
    void play(Note n) {
        System.out.println("exercise.Brass.play() " + n);
    }

    void adjust() {
        System.out.println("exercise.Brass.adjust()");
    }
}


class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("exercise.Woodwind.play() " + n);
    }

    public String toString() {
        return "exercise.Woodwind";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
public class E06_MusicToString {
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
