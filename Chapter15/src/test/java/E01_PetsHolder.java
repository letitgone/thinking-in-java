import section_02.Holder3;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;

/**
 * @Author ZhangGJ
 * @Date 2019/07/22
 */
public class E01_PetsHolder {
    public static void main(String[] args) {
        Holder3<Pet> h3 = new Holder3<Pet>(new Mouse("Mickey"));
        System.out.println(h3.get());
    }
}
