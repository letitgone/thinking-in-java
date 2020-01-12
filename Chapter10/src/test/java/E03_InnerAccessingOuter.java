class Outer2 {
    private final String data;


    class Inner {
        public String toString() {
            return data;
        }
    }

    Outer2(String data) {
        this.data = data;
    }

    Inner getInner() {
        return new Inner();
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/05/06
 */
public class E03_InnerAccessingOuter {
    public static void main(String[] args) {
        Outer2 o = new Outer2("Inner accessing outer!");
        Outer2.Inner i = o.getInner();
        System.out.println(i.toString());
    }
}
