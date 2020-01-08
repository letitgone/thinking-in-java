package exercise.eight.access;

import exercise.eight.access.connection2.Connection;
import exercise.eight.access.connection2.ConnectionManager;

/**
 * @Author ZhangGJ
 * @Date 2019/04/06
 */
public class E08_ConnectionManager2 {
    public static void main(String args[]) {
        Connection[] ca = new Connection[10];
        // Use up all the connections
        for (int i = 0; i < 10; i++) {
            ca[i] = ConnectionManager.getConnection();
        }
        // Should produce "null" since there are no
        // more connections:
        System.out.println(ConnectionManager.getConnection());
        // Return connections, then get them out:
        for (int i = 0; i < 5; i++) {
            ca[i].checkIn();
            Connection c = ConnectionManager.getConnection();
            System.out.println(c);
            c.doSomething();
            c.checkIn();
        }
    }
}