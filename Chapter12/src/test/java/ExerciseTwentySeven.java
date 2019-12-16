/**
 * @Author ZhangGJ
 * @Date 2019/06/09
 */
public class ExerciseTwentySeven {
    public static void main(String args[]) {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
