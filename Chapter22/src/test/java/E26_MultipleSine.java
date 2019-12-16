import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class MultiSineWave extends JFrame {
    ExtSineDraw[] sines;
    JSlider cycles = new JSlider(1, 30, 5);

    public MultiSineWave(int panels) {
        int side = Math.round((float) Math.sqrt((double) panels));
        JPanel jp = new JPanel(new GridLayout(side, side));
        sines = new ExtSineDraw[panels];
        for (int i = 0; i < sines.length; i++) {
            sines[i] = new ExtSineDraw();
            jp.add(sines[i]);
        }
        add(jp);
        add(BorderLayout.SOUTH, cycles);
        cycles.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                for (int i = 0; i < sines.length; i++)
                    sines[i].setCycles(((JSlider) e.getSource()).getValue());
            }
        });
    }
}


public class E26_MultipleSine {
    public static void main(String[] args) {
        int panels;
        if (args.length != 0)
            panels = Integer.parseInt(args[0]);
        else
            panels = 4;
        run(new MultiSineWave(panels), 700, 400);
    }
}
