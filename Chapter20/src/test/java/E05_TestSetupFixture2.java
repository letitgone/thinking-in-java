import net.mindview.atunit.Test;
import net.mindview.util.OSExecute;

import java.util.HashSet;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class E05_TestSetupFixture2 extends HashSet<String> {
    @Test
    void _t1() {
        assert isEmpty();
        add("one");
    }

    @Test
    void _t2() {
        assert isEmpty();
        add("one");
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java " + "net.mindview.atunit.AtUnit E05_TestSetupFixture2");
    }
}
