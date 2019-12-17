/**
 * @Author ZhangGJ
 * @Date 2019/03/18
 */
public class ExerciseFour {
    public static void main(String[] args) {
        String distance = args[0];
        String time = args[1];
        if ("".equals(distance) || distance == null || "".equals(distance) || distance == null) {
            System.exit(1);
        } else {
            double speed = Double.parseDouble(distance) / Double.parseDouble(time);
            System.out.println("speed is: " + speed);
        }
    }
}
