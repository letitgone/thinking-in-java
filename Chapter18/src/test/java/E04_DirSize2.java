import net.mindview.util.Directory;

import java.io.File;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
public class E04_DirSize2 {
    public static void main(String[] args) {
        Directory.TreeInfo ti;
        if (args.length == 0)
            ti = Directory.walk(".");
        else
            ti = Directory.walk("../object", args[0]);
        long total = 0;
        for (File file : ti)
            total += file.length();
        System.out.println(ti.files.size() + " file(s), " + total + " bytes");
    }
}
