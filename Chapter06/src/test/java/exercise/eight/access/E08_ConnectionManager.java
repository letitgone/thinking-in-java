package exercise.eight.access;

import exercise.eight.access.connection.Connection;
import exercise.eight.access.connection.ConnectionManager;

/**
 * @Author ZhangGJ
 * @Date 2019/04/06
 */
public class E08_ConnectionManager {
    public static void main(String args[]) {
        Connection c = ConnectionManager.getConnection();
        while (c != null) {
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
