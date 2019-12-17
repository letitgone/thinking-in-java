package section_07;

/**
 * @Author ZhangGJ
 * @Date 2019/03/19
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2); // 比较的是对象的引用
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));
    }
}
