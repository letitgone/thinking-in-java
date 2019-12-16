package section_06;

import javax.swing.*;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class GridLayout1 extends JFrame {
    public GridLayout1() {
        setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 20; i++)
            add(new JButton("Button " + i));
    }

    public static void main(String[] args) {
        run(new GridLayout1(), 300, 300);
    }
}
