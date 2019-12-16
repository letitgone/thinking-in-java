package section_02;

/**
 * @Author ZhangGJ
 * @Date 2019/06/18
 */
class Building {
}


class House extends Building {
}


public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; // ... or just do this.
    }
}
