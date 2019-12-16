import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

import java.util.HashSet;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class E04_TestSetupFixture {
    HashSet<String> testObject = new HashSet<String>();

    @Test
    void _t1() {
        assert testObject.isEmpty();
        testObject.add("one");
    }

    @Test
    void _t2() {
        assert testObject.isEmpty();
        testObject.add("one");
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java " + "net.mindview.atunit.AtUnit E04_TestSetupFixture");
    }
}
