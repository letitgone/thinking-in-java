/**
 * @Author ZhangGJ
 * @Date 2019/12/29 10:21
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "123";
        dog.age = 12;

        System.out.println("===" + dog.age);
        Dog dog1 = new Dog();
        Cat cat = new Cat();
        System.out.println(dog == dog1);
//        System.out.println(dog == cat);
    }
}
