package section_01;

import section_09.Spiciness;

import static section_09.Spiciness.HOT;
import static section_09.Spiciness.MEDIUM;
import static section_09.Spiciness.NOT;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
