/**
 * @Author ZhangGJ
 * @Date 2019/06/13
 */
public class ExerciseFour {
    public static void main(String[] args) {
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = (Rhomboid) shape;
        // Test before Downcasting:
        Circle c = null;
        if (shape instanceof Circle) { // instanceof 左边对象是否为instanceof 右边类的实例，返回一个boolean类型值
            c = (Circle) shape;
        } else {
            System.out.println("shape not a Circle");
        }
    }
}
