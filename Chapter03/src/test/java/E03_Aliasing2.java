class Product1 {
    float price;
}


/**
 * @Author ZhangGJ
 * @Date 2019/03/18
 */
public class E03_Aliasing2 {
    static void m(Product1 x) {
        x.price = 23.4f;
    }

    public static void main(String[] args) {
        Product1 p = new Product1();
        p.price = 78.4f;
        System.out.println(p.price);
        m(p);
        System.out.println(p.price);
    }
}
