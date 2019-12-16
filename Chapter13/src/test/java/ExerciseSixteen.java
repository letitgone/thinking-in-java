import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ZhangGJ
 * @Date 2019/06/12
 */
public class ExerciseSixteen {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java E16_JGrep3 file regex");
            System.exit(0);
        }
        File file = new File(args[0]);
        File[] files = null;
        if (file.isDirectory())
            files = file.listFiles();
        else
            files = new File[] {new File(args[0])};
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher("");
        for (File f : files) {
            System.out.println("-- File:" + f.getName() + "--");
            // Iterate through the lines of the input file:
            int index = 0;
            for (String line : new TextFile(f.getAbsolutePath())) {
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}
