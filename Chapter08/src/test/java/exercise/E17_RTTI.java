package exercise;

class Cycle2 {
}


class Unicycle2 extends Cycle2 {
    public void balance() {
    }
}


class Bicycle2 extends Cycle2 {
    public void balance() {
    }
}


class Tricycle2 extends Cycle2 {
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/15
 */
public class E17_RTTI {
    public static void main(String[] args) {
        Cycle2[] cycles = new Cycle2[] {new Unicycle2(), new Bicycle2(), new Tricycle2()};
        // Compile time: method not found in Cycle:
        // cycles[0].balance();
        // cycles[1].balance();
        // cycles[2].balance();
        ((Unicycle2) cycles[0]).balance();  // Downcast/RTTI
        ((Bicycle2) cycles[1]).balance();   // Downcast/RTTI
        ((Unicycle2) cycles[2]).balance();  // Exception thrown
    }
}
