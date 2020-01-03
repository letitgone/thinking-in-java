package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/04/03
 */
public class E18_ObjectArray {
    public static void main(String args[]) {
        Test[] array = new Test[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Test(Integer.toString(i));
        }
    }
}
