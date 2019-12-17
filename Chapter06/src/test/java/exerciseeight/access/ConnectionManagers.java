package exerciseeight.access;

import exerciseeight.access.connection.Connection;
import exerciseeight.access.connection.ConnectionManager;

/**
 * @Author ZhangGJ
 * @Date 2019/04/06
 */
public class ConnectionManagers {
    public static void main(String args[]) {
        Connection c = ConnectionManager.getConnection();
        while (c != null) {
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
