package exercise;

class LoadTest {
    // The static clause is executed
    // upon class loading:
    static {
        System.out.println("Loading exercise.LoadTest");
    }

    static void staticMember() {
    }
}


/**
 * @Author ZhangGJ
 * @Date 2019/04/10
 */
public class E23_ClassLoading {
    public static void main(String args[]) {
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Creating an object");
        new LoadTest();
    }
}
