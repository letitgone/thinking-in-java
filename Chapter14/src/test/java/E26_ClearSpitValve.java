import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/07/19
 */
interface Instrument {
    void play();

    String what();

    void adjust();

    void prepareInstrument();
}


class Wind implements Instrument {
    public void play() {
        print("Wind.play()");
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
    }

    public void clearSpitValve() {
        print("Wind.clearSpitValve");
    }

    public void prepareInstrument() {
        clearSpitValve();
    }
}


class Percussion implements Instrument {
    public void play() {
        print("Percussion.play()");
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
    }

    public void prepareInstrument() {
        print("Percussion.prepareInstrument");
    }
}


class Stringed implements Instrument {
    public void play() {
        print("Stringed.play()");
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
    }

    public void prepareInstrument() {
        print("Stringed.prepareInstrument");
    }
}


class Brass extends Wind {
    public void play() {
        print("Brass.play()");
    }

    public void adjust() {
        print("Brass.adjust()");
    }

    public void clearSpitValve() {
        print("Brass.clearSpitValve");
    }
}


class Woodwind extends Wind {
    public void play() {
        print("Woodwind.play()");
    }

    public String what() {
        return "Woodwind";
    }

    public void clearSpitValve() {
        print("Woodwind.clearSpitValve");
    }
}


class Music5 {
    static void tune(Instrument i) {
        // ...
        i.play();
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument instrument : e)
            tune(instrument);
    }

    static void prepareAll(Instrument[] e) {
        for (Instrument instrument : e)
            instrument.prepareInstrument();
    }
}


public class E26_ClearSpitValve {
    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),};
        Music5.prepareAll(orchestra);
        Music5.tuneAll(orchestra);
    }
}
