import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class TypeableButton extends JFrame {
    JTextField txt = new JTextField(10);
    JButton b = new JButton("Button 1");

    public TypeableButton() {
        setLayout(new FlowLayout());
        add(txt);
        add(b);
        b.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                txt.setText(txt.getText() + e.getKeyChar());
            }
        });
    }
}


public class E10_TypeableButton {
    public static void main(String args[]) {
        run(new TypeableButton(), 200, 100);
    }
}
