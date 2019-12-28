import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class Password extends JFrame {
    JPasswordField pwd = new JPasswordField(10);

    public Password() {
        setLayout(new FlowLayout());
        add(new JLabel("Type in your password:"));
        add(pwd);
        pwd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "Incorrect Password";
                JPasswordField pass = (JPasswordField) e.getSource();
                if ("Blarth".equals(new String(pass.getPassword())))
                    message = "Correct Password";
                JOptionPane.showMessageDialog(null, message, "information",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}


public class E17_Password {
    public static void main(String args[]) {
        run(new Password(), 200, 100);
    }
}
