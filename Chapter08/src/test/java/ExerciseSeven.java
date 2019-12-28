import section_01.Note;

/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Electronic extends Instrument {
    void play(Note n) {
        System.out.println("Electronic.play() " + n);
    }

    public String toString() {
        return "Electronic";
    }
}


public class ExerciseSeven {
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
