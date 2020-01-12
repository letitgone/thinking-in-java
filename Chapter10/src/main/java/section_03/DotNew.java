package section_03;

/**
 * @Author ZhangGJ
 * @Date 2020/01/12 10:34
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
