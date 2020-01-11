package exercise;

abstract class BaseWithPrint {
    public BaseWithPrint() {
        print();
    }

    public abstract void print();
}


class DerivedWithPrint extends BaseWithPrint {
    int i = 47;

    public void print() {
        System.out.println("i = " + i);
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/16
 */
public class E03_Initialization {
    public static void main(String args[]) {
        DerivedWithPrint dp = new DerivedWithPrint();
        dp.print();
    }
}
