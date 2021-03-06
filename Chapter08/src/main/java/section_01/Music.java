package section_01;

/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
public class Music {
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        // Upcasting
        tune(flute);
    }
}
