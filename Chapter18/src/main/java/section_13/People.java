package section_13;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;

import java.util.ArrayList;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class People extends ArrayList<Person> {
    public People(String fileName) throws Exception {
        Document doc = new Builder().build(fileName);
        Elements elements = doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size(); i++)
            add(new Person(elements.get(i)));
    }

    public static void main(String[] args) throws Exception {
        People p = new People("/Users/zhanggengjia/Downloads/IntellijProject/thinking_in_java/People.xml");
        System.out.println(p);
    }
}
