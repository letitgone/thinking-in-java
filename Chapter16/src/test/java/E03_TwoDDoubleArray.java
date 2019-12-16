import java.util.Locale;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/09/30
 */
public class E03_TwoDDoubleArray {
    public static double[][] twoDDoubleArray(int xLen, int yLen, double valStart, double valEnd) {
        double[][] array = new double[xLen][yLen];
        double increment = (valEnd - valStart) / (xLen * yLen);
        double val = valStart;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = val;
                val += increment;
            }
        return array;
    }

    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.printf(Locale.US, "%.2f ", array[i][j]);
            print();
        }
    }

    public static void main(String args[]) {
        double[][] twoD = twoDDoubleArray(4, 6, 47.0, 99.0);
        printArray(twoD);
        print("**********************");
        double[][] twoD2 = twoDDoubleArray(2, 2, 47.0, 99.0);
        printArray(twoD2);
        print("**********************");
        double[][] twoD3 = twoDDoubleArray(9, 5, 47.0, 99.0);
        printArray(twoD3);
    }
}
