import java.util.Locale;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class E04_ThreeDDoubleArray {
    public static double[][][] threeDDoubleArray(int xLen, int yLen, int zLen, double valStart,
            double valEnd) {
        double[][][] array = new double[xLen][yLen][zLen];
        double increment = (valEnd - valStart) / (xLen * yLen * zLen);
        double val = valStart;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = val;
                    val += increment;
                }
        return array;
    }

    public static void printArray(double[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++)
                    System.out.printf(Locale.US, "%.2f ", array[i][j][k]);
                print();
            }
            print();
        }
    }

    public static void main(String args[]) {
        double[][][] threeD = threeDDoubleArray(4, 6, 2, 47.0, 99.0);
        printArray(threeD);
        print("**********************");
        double[][][] threeD2 = threeDDoubleArray(2, 2, 5, 47.0, 99.0);
        printArray(threeD2);
        print("**********************");
        double[][][] threeD3 = threeDDoubleArray(9, 5, 7, 47.0, 99.0);
        printArray(threeD3);
    }
}
