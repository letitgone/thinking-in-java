package exercise;

class Cycle1 {
    int wheels() {
        return 0;
    }
}


class Unicycle1 extends Cycle1 {
    int wheels() {
        return 0;
    }
}


class Bicycle1 extends Cycle1 {
    int wheels() {
        return 0;
    }
}


class Tricycle1 extends Cycle1 {
    int wheels() {
        return 0;
    }
}

/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
public class E05_Wheels {
    public static void ride(Cycle1 c) {
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Cycle1());    // No upcasting
        ride(new Unicycle1()); // Upcast
        ride(new Bicycle1());  // Upcast
        ride(new Tricycle1()); // Upcast
    }
}
