import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E12_LineNumber {
    public static void main(String[] args) throws java.io.IOException {
        if (args.length != 2) {
            System.err.println("Usage: java E12_LineNumber infile outfile");
            return;
        }
        List<String> list = E07_FileIntoList.read(args[0]);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
        // We need to count backwards...
        int line = list.size();
        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious(); )
            out.println(line-- + ": " + it.previous());
        out.close();
    }
}
