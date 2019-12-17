package section_08;

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


public class LostMessage {
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    public void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
