package section_04;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}


public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {{new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()},};
        System.out.println(Arrays.deepToString(spheres));
    }
}
