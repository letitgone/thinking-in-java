/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class E37_Valve implements java.io.Serializable {
    private boolean on;
    private int level;

    public E37_Valve() {
    }

    public E37_Valve(boolean on, int level) {
        this.on = on;
        this.level = level;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static void main(String args[]) {
        E37_Valve v = new E37_Valve(true, 100);
        System.out.println("v.isOn() = " + v.isOn());
        System.out.println("v.getLevel() = " + v.getLevel());
    }
}
