package exercise.eight.access.connection;

/**
 * @Author ZhangGJ
 * @Date 2019/04/06
 */
public class Connection {
    private static int counter = 0;
    private int id = counter++;

    Connection() {
    }

    public String toString() {
        return "Connection " + id;
    }

    public void doSomething() {
    }
}
