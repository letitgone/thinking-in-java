import java.io.FileInputStream;

/**
 * @Author ZhangGJ
 * @Date 2019/06/09
 */
public class ExerciseTwentySix {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("DoesnotExist.file");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
