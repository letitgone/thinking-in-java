/**
 * @Author ZhangGJ
 * @Date 2019/03/26
 */
public class E02_StringInitialization {
    String s1 = "Initialized at definition";
    String s2;

    public E02_StringInitialization(String s2i) {
        s2 = s2i;
    }

    public static void main(String[] args) {
        E02_StringInitialization si = new E02_StringInitialization("Initialized at construction");
        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s2 = " + si.s2);
    }
}
