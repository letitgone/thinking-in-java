import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/06/17
 */
public class ExerciseTen {
    public static void main(String args[]) {
        char[] ac = "Hello, World!".toCharArray();
        print("ac.getClass() = " + ac.getClass());
        print("ac.getClass().getSuperclass() = " + ac.getClass().getSuperclass());
        char c = 'c';
        //! c.getClass(); // Can't do it, primitives
        // are not true objects.
        int[] ia = new int[3];
        print("ia.getClass() = " + ia.getClass());
        long[] la = new long[3];
        print("la.getClass() = " + la.getClass());
        double[] da = new double[3];
        print("da.getClass() = " + da.getClass());
        String[] sa = new String[3];
        print("sa.getClass() = " + sa.getClass());
        ExerciseTen[] pot = new ExerciseTen[3];
        print("pot.getClass() = " + pot.getClass());
        // Multi-dimensional arrays:
        int[][][] threed = new int[3][][];
        print("threed.getClass() = " + threed.getClass());
    }
}
