import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E10_FindWords {
    public static void main(String[] args) throws java.io.IOException {
        if (args.length < 2) {
            System.err.println("Usage: java E10_FindWords file words");
            return;
        }
        Set<String> words = new HashSet<String>();
        for (int i = 1; i < args.length; i++)
            words.add(args[i]);
        List<String> list = E07_FileIntoList.read(args[0]);
        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious(); ) {
            String candidate = it.previous();
            for (String word : words)
                if (candidate.indexOf(word) != -1) {
                    System.out.println(candidate);
                    break;
                }
        }
    }
}
