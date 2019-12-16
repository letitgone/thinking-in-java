package section_08;

import net.mindview.util.Null;

import java.util.Arrays;
import java.util.List;

/**
 * @Author ZhangGJ
 * @Date 2019/07/19
 */
interface Operation {
    String description();

    void command();
}


interface Robot {
    String name();

    String model();

    List<Operation> operations();

    class Test {
        public static void test(Robot r) {
            if (r instanceof Null)
                System.out.println("[Null Robot]");
            System.out.println("Robot name: " + r.name());
            System.out.println("Robot model: " + r.model());
            for (Operation operation : r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}


public class SnowRemovalRobot implements Robot {
    private String name;

    public SnowRemovalRobot(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String model() {
        return "SnowBot Series 11";
    }

    public List<Operation> operations() {
        return Arrays.asList(new Operation() {
            public String description() {
                return name + " can shovel snow";
            }

            public void command() {
                System.out.println(name + " shoveling snow");
            }
        }, new Operation() {
            public String description() {
                return name + " can chip ice";
            }

            public void command() {
                System.out.println(name + " chipping ice");
            }
        }, new Operation() {
            public String description() {
                return name + " can clear the roof";
            }

            public void command() {
                System.out.println(name + " clearing roof");
            }
        });
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
