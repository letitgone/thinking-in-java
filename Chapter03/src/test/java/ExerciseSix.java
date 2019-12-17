/**
 * @Author ZhangGJ
 * @Date 2019/03/19
 */
public class ExerciseSix {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d1;
        d1.name = "spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf!";
        System.out.println("Comparing dog1 and dog2 objects...");
        compare(d1, d2);
        System.out.println("Comparing dog1 and dog3 objects...");
        compare(d1, d3);
        System.out.println("Comparing dog2 and dog3 objects...");
        compare(d2, d3);
    }

    static void compare(Dog dog1, Dog dog2) {
        System.out.println("== on top references: " + (dog1 == dog2));
        System.out.println("equals() on top references: " + dog1.equals(dog2));
        System.out.println("== on names: " + (dog1.name == dog2.name));
        System.out.println("equals() on names: " + dog1.name.equals(dog2.name));
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println("equals() on says: " + dog1.says.equals(dog2.says));
    }
}
