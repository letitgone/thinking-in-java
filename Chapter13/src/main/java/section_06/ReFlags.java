package section_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ZhangGJ
 * @Date 2019/06/12
 */
public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
            "java has regex\nJava has regex\n" + "JAVA has pretty good regular expressions\n"
                + "Regular expressions are in Java");
        while (m.find())
            System.out.println(m.group());
    }
}
