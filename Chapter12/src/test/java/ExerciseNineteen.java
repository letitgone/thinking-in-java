import section_08.LostMessage;

/** ???
 * @Author ZhangGJ
 * @Date 2019/06/04
 */
public class ExerciseNineteen {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
//                try {
//                    lm.dispose();
//                } catch(HoHumException e) {
//                    System.out.println(e);
//                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
