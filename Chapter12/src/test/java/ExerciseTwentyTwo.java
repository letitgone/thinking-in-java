/**
 * @Author ZhangGJ
 * @Date 2019/06/09
 */
class ConstructionException extends Exception {
}


class FailingConstructor {
    FailingConstructor(boolean fail) throws ConstructionException {
        if (fail) {
            throw new ConstructionException();
        }
    }
}


public class ExerciseTwentyTwo {
    public static void main(String args[]) {
        for (boolean b = false; ; b = !b)
            try {
                System.out.println("Constructing...");
                FailingConstructor fc = new FailingConstructor(b);
                try {
                    System.out.println("Processing...");
                } finally {
                    System.out.println("Cleanup...");
                }
            } catch (ConstructionException e) {
                System.out.println("Construction has failed: " + e);
                break;
            }
    }
}
