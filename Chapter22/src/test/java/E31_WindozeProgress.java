import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class WindozeProgress extends JFrame {
    JProgressBar pb = new JProgressBar(0, 100);
    JLabel jl = new JLabel("Makin' some progress now!");
    Timer tm = new Timer(50, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (pb.getValue() == pb.getMaximum()) {
                tm.stop();
                jl.setText("That wasn't so bad, was it?");
            }
            double percent = (double) pb.getValue() / (double) pb.getMaximum();
            tm.setDelay((int) (tm.getDelay() * (1.0 + percent * 0.07)));
            pb.setValue(pb.getValue() + 1);
            if (percent > 0.90)
                if (Math.random() < 0.25)
                    pb.setValue(pb.getValue() - 10);
        }
    });

    public WindozeProgress() {
        setLayout(new FlowLayout());
        add(pb);
        add(jl);
        pb.setValue((int) (pb.getMaximum() * 0.25));
        tm.start();
    }
}


public class E31_WindozeProgress {
    public static void main(String args[]) {
        run(new WindozeProgress(), 300, 100);
    }
}
