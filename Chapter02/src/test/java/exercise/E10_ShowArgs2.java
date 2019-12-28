package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/12/28 09:28
 */
public class E10_ShowArgs2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Need 3 arguments");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
