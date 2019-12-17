package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/03/14
 */
public class Wrapper {
    /**
     * 包装类
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 5;
        Integer in = new Integer(i);
        System.out.println(in);
        Integer in1 = new Integer(6);
        System.out.println(in1);
        Integer in2 = 7;
        System.out.println(in2);
        // 反向使用
        int i1 = in2;
        int i2 = in1;
        System.out.println(i1);
        System.out.println(i2);
    }
}
