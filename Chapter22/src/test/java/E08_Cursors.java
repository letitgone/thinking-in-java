import javax.swing.*;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class Cursors extends JFrame {
    JTextField txt = new JTextField(10);
    JButton b1 = new JButton("Button 1");
    Cursor hand = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);

    public Cursors() {
        setLayout(new FlowLayout());
        add(txt);
        txt.setCursor(hand);
        add(b1);
        setCursor(hand);
    }
}


public class E08_Cursors {
    public static void main(String args[]) {
        run(new Cursors(), 200, 100);
    }
}
