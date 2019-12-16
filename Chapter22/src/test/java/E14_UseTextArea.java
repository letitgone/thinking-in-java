import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class TextPane extends JFrame {
    private JButton b = new JButton("Add Text");
    // Only needed to change this one line:
    JTextArea tp = new JTextArea();
    private static Generator<String> sg = new RandomGenerator.String(7);

    public TextPane() {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 1; i < 10; i++)
                    tp.setText(tp.getText() + sg.next() + "\n");
            }
        });
        add(new JScrollPane(tp));
        add(BorderLayout.SOUTH, b);
    }
}


public class E14_UseTextArea {
    public static void main(String[] args) {
        run(new TextPane(), 475, 425);
    }
}
