import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class ColorChooser extends JFrame {
    JButton b1 = new JButton("Color Chooser");

    public ColorChooser() {
        setLayout(new FlowLayout());
        add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JColorChooser.showDialog(null, "E29_ColorChooser", Color.cyan);
            }
        });
    }
}


public class E29_ColorChooser {
    public static void main(String args[]) {
        run(new ColorChooser(), 150, 75);
    }
}
