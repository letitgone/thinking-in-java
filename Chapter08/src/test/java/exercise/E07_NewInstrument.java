package exercise;

import section_01.Note;


class Electronic extends Instrument {
    void play(Note n) {
        System.out.println("exercise.Electronic.play() " + n);
    }

    public String toString() {
        return "exercise.Electronic";
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
public class E07_NewInstrument {
    static Instrument[] orchestra =
        {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
            new Electronic()};

    public static void main(String args[]) {
        for (Instrument i : orchestra) {
            i.play(Note.MIDDLE_C);
            i.adjust();
            System.out.println(i);
        }
    }
}
