package exercise;

import section_01.Note;

interface Instrument2 {
    void adjust();
}


interface Playable {
    void play(Note n);
}


class Wind2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "exercise.Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


class Percussion2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "exercise.Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


class Stringed2 implements Instrument2, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "exercise.Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}


class Brass2 extends Wind2 {
    public String toString() {
        return "exercise.Brass";
    }
}


class Woodwind2 extends Wind2 {
    public String toString() {
        return "exercise.Woodwind";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class E10_PlayableMusic5 {
    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable p : e)
            tune(p);
    }

    public static void main(String[] args) {
        Playable[] orchestra =
            {new Wind2(), new Percussion2(), new Stringed2(), new Brass2(), new Woodwind2()};
        tuneAll(orchestra);
    }
}
