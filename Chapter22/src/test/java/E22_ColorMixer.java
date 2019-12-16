import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class ColorMixer extends JFrame {
    class ColorSlider extends JPanel {
        JSlider slider;
        JTextField value;

        public ColorSlider(String title) {
            super(new FlowLayout());
            slider = new JSlider(0, 255, 0);
            value = new JTextField(3);
            add(new JLabel(title));
            add(slider);
            value.setText("" + slider.getValue());
            add(value);
            slider.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent e) {
                    value.setText("" + slider.getValue());
                    reColor();
                }
            });
        }
    }


    ColorSlider red = new ColorSlider("red"), green = new ColorSlider("green"), blue =
        new ColorSlider("blue");
    JPanel color = new JPanel();

    void reColor() {
        color.setBackground(
            new Color(red.slider.getValue(), green.slider.getValue(), blue.slider.getValue()));
    }

    public ColorMixer() {
        setLayout(new GridLayout(2, 1));
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(red);
        jp.add(green);
        jp.add(blue);
        add(jp);
        add(color);
        reColor();
    }
}


public class E22_ColorMixer {
    public static void main(String args[]) {
        run(new ColorMixer(), 350, 300);
    }
}
