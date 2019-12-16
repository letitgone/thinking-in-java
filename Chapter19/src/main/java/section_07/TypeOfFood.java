package section_07;

import static section_07.Food.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
}
