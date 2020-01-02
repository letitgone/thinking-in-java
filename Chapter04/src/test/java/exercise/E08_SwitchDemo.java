package exercise;

/**
 * @Author ZhangGJ
 * @Date 2019/03/25
 */
public class E08_SwitchDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    System.out.println("Output : " + i);
                    break;
                default:
                    System.out.println("Default : " + i);
            }
        }
        System.out.println("remove break");
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Output : " + i);
                case 1:
                    System.out.println("Output : " + i);
                case 2:
                    System.out.println("Output : " + i);
                default:
                    System.out.println("Default : " + i);
            }
        }
    }
}
