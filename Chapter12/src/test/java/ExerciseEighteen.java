/**
 * @Author ZhangGJ
 * @Date 2019/06/04
 */

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}


class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}


class YetAnotherException extends Exception {
    public String toString() {
        return "Yet another exception";
    }
}


class LostMessage2 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void cleanup() throws YetAnotherException {
        throw new YetAnotherException();
    }
}


public class ExerciseEighteen {
    public static void main(String[] args) {
        try {
            LostMessage2 lm = new LostMessage2();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.cleanup();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
