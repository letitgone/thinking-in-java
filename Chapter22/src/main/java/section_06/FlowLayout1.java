package section_06;

import javax.swing.*;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class FlowLayout1 extends JFrame {
    public FlowLayout1() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++)
            add(new JButton("Button " + i));
    }

    public static void main(String[] args) {
        run(new FlowLayout1(), 300, 300);
    }
}
