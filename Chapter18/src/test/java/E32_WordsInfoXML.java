import net.mindview.util.TextFile;
import nu.xom.Document;
import nu.xom.Element;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E32_WordsInfoXML {
    // Produce an XML Element from this Map.Entry object:
    static Element getXML(Map.Entry<String, Integer> me) {
        Element record = new Element("record");
        Element word = new Element("word");
        word.appendChild(me.getKey());
        Element freq = new Element("frequency");
        freq.appendChild(me.getValue().toString());
        record.appendChild(word);
        record.appendChild(freq);
        return record;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Integer> wordsStat = new HashMap<String, Integer>();
        for (String word : new TextFile("/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/Chapter18/src/test/java/E32_WordsInfoXML.java", "\\W+")) {
            Integer freq = wordsStat.get(word);
            wordsStat.put(word, freq == null ? 1 : freq + 1);
        }
        Element root = new Element("words");
        for (Map.Entry<String, Integer> me : wordsStat.entrySet())
            root.appendChild(getXML(me));
        Document doc = new Document(root);
        Person.format(System.out, doc);
        Person.format(new BufferedOutputStream(new FileOutputStream("WordsInfo.xml")), doc);
    }
}
