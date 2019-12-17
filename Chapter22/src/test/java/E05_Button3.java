import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class E05_Button3 extends JFrame {
    private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2"), b3 =
            new JButton("Button 3");
    private JTextField txt = new JTextField(10);
    private ActionListener bl = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();
            txt.setText(name);
        }
    };

    public E05_Button3() {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        b3.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        add(txt);
    }

    public static void main(String[] args) {
        run(new E05_Button3(), 200, 150);
    }
}
