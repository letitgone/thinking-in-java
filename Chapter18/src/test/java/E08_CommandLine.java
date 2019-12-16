import java.util.List;
import java.util.ListIterator;

/**
 * @Author ZhangGJ
 * @Date 2019/10/02
 */
public class E08_CommandLine {
    public static void main(String[] args) throws java.io.IOException {
        if (args.length != 1) {
            System.err.println("Usage: java E08_CommandLine file");
            return;
        }
        List<String> list = E07_FileIntoList.read(args[0]);
        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious(); )
            System.out.println(it.previous());
    }
}
