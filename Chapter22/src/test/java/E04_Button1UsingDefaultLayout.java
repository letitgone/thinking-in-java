import javax.swing.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class E04_Button1UsingDefaultLayout extends JFrame {
    private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2");

    public E04_Button1UsingDefaultLayout() {
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        run(new E04_Button1UsingDefaultLayout(), 200, 100);
    }
}
