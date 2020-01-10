package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/04/11
 */
class Meal {
    Meal() {
        System.out.println("exercise.Meal()");
    }
}


class Bread {
    Bread() {
        System.out.println("exercise.Bread()");
    }
}


class Cheese {
    Cheese() {
        System.out.println("exercise.Cheese()");
    }
}


class Lettuce {
    Lettuce() {
        System.out.println("exercise.Lettuce()");
    }
}


class Lunch extends Meal {
    Lunch() {
        System.out.println("exercise.Lunch()");
    }
}


class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("exercise.PortableLunch()");
    }
}


class Pickle {
    Pickle() {
        System.out.println("exercise.Pickle()");
    }
}


class Sandwich2 extends PortableLunch {
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Pickle p = new Pickle();

    Sandwich2() {
        System.out.println("Sandwich()");
    }
}


public class E11_Pickle {
    public static void main(String args[]) {
        new Sandwich2();
    }
}
