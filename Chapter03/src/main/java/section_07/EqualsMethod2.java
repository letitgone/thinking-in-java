package section_07;

class Value {
    int i;
}


/**
 * @Author ZhangGJ
 * @Date 2019/03/19
 */
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2)); // equals默认比较对象的引用
    }
}
