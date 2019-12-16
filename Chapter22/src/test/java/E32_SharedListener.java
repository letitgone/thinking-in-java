import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class Progress extends JFrame {
    JProgressBar pb = new JProgressBar();
    JSlider sb = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);

    public Progress() {
        setLayout(new GridLayout(2, 1));
        add(pb);
        sb.setValue(0);
        sb.setPaintTicks(true);
        sb.setMajorTickSpacing(20);
        sb.setMinorTickSpacing(5);
        sb.setBorder(new TitledBorder("Slide Me"));
        pb.setModel(sb.getModel()); // Share model
        add(sb);
        sb.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                pb.setValue(sb.getValue());
            }
        });
    }
}


public class E32_SharedListener {
    public static void main(String args[]) {
        run(new Progress(), 300, 200);
    }
}
