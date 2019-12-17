import java.util.*;

/**
 * @Author ZhangGJ
 * @Date 2019/09/19
 */
public class E35_CheckedList2 {
    //    @SuppressWarnings("unchecked")
    //    static void oldStyleMethod(List probablyAmericanos) {
    //        probablyAmericanos.add(new Breve());
    //    }
    //    public static void main(String[] args) {
    //        List<Americano> am1 = new ArrayList<Americano>();
    //        oldStyleMethod(am1); // Quietly accepts a Breve
    //        List<Americano> am2 = Collections.checkedList(
    //            new ArrayList<Americano>(), Americano.class);
    //        try {
    //            oldStyleMethod(am2); // Throws an exception
    //        } catch(Exception e) {
    //            System.out.println(e);
    //        }
    //        // Derived types work fine:
    //        List<Coffee> coffees = Collections.checkedList(
    //            new ArrayList<Coffee>(), Coffee.class);
    //        coffees.add(new Americano());
    //        coffees.add(new Breve());
    //    }
}
