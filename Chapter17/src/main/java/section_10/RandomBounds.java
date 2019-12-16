package section_10;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
public class RandomBounds {
    static void usage() {
        print("Usage:");
        print("\tRandomBounds lower");
        print("\tRandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        //        java RandomBounds lower  or  java RandomBounds upper
        if (args.length != 1)
            usage();
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0)
                ; // Keep trying
            print("Produced 0.0!");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0)
                ; // Keep trying
            print("Produced 1.0!");
        } else
            usage();
    }
}
