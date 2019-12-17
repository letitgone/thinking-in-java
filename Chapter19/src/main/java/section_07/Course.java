package section_07;

import section_06.Enums;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public enum Course {
    APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), DESSERT(
            Food.Dessert.class), COFFEE(Food.Coffee.class);
    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
}
