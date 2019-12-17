/**
 * @Author ZhangGJ
 * @Date 2019/05/06
 */
class Outer3 {
    class Inner {
        {
            System.out.println("Inner created");
        }
    }
}


public class ExerciseFive {
    public static void main(String args[]) {
        Outer3 o = new Outer3();
        Outer3.Inner i = o.new Inner();
    }
}
