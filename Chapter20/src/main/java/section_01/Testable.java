package section_01;

import net.mindview.atunit.Test;

/**
 * @Author ZhangGJ
 * @Date 2019/10/04
 */
public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
}
