class Product {
    float price;
}


/**
 * @Author ZhangGJ
 * @Date 2019/03/18
 */
public class E02_Aliasing {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        p1.price = 1.4f;
        p2.price = 45.8f;
        System.out.println(p1.price + ", " + p2.price);
        p2 = p1;
        System.out.println(p1.price + ", " + p2.price);
        p2.price = 56.4f;
        System.out.println(p1.price + ", " + p2.price);
    }
}
