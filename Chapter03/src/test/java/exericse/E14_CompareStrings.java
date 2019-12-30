package exericse;

/**
 * @Author ZhangGJ
 * @Date 2019/03/22
 */
//public class E14_CompareStrings {
//    static void compare(String s1, String s2) {
//        boolean b1 = s1.equals(s2);
//        boolean b2 = (s1 == s2);
//        boolean b3 = (s1 != s2);
//        System.out.println("b1: " + b1);
//        System.out.println("b2: " + b2);
//        System.out.println("b3: " + b3);
//        System.out.println("==================");
//    }
//
//    public static void main(String[] args) {
//        compare("b", "a");
//        compare("hello", "hello");
//        String s = new String("hello");
//        compare("hello", s);
//    }
//}
public class E14_CompareStrings {
    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }

    public static void compare(String lval, String rval) {
        System.out.println("lval: " + lval + " rval: " + rval); //! p("lval < rval: " + lval < rval);
        //! p("lval > rval: " + lval > rval);
        //! p("lval <= rval: " + lval <= rval); //! p("lval >= rval: " + lval >= rval);
        p("lval == rval", lval == rval);
        p("lval != rval", lval != rval);
        p("lval.equals(rval)", lval.equals(rval));
    }

    public static void main(String[] args) {
        compare("Hello", "Hello");
        // Force creation of separate object:
        String s = new String("Hello");
        compare("Hello", s);
        compare("Hello", "Goodbye");
    }
}
