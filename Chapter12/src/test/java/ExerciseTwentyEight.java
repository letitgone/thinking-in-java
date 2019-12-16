/**
 * @Author ZhangGJ
 * @Date 2019/06/09
 */
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String s) {
        super(s);
    }
}


public class ExerciseTwentyEight {
    public static void main(String args[]) {
        throw new MyRuntimeException("MyRuntimeException msg");
    }
}
