import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class RandomColorButton extends JButton {
    private static final Color[] colors =
            {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green,
                    Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red,
                    Color.white, Color.yellow};
    private static Random rnd = new Random(47);

    private static final Color newColor() {
        return colors[rnd.nextInt(colors.length)];
    }

    public RandomColorButton(String text) {
        super(text);
        setBackground(newColor());
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(newColor());
            }
        });
    }
}


public class E11_RandomColorButton extends JFrame {
    E11_RandomColorButton() {
        add(new RandomColorButton("Random Colors"));
    }

    public static void main(String args[]) {
        run(new E11_RandomColorButton(), 150, 75);
    }
}
