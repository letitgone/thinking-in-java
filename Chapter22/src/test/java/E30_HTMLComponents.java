import javax.swing.*;
import java.awt.*;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class HTMLComponents extends JFrame {
    JMenu[] menus = {new JMenu("Text"), new JMenu("<html><i>HTML")};
    JMenuItem[] items =
        {new JMenuItem("Text Item"), new JMenuItem("<html><b><font size=+1>HTML Item")};

    public HTMLComponents() {
        setLayout(new FlowLayout());
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("<html><font size=+1>Tab 1", new JCheckBox("<html><u>Check me!"));
        tabs.addTab("<html><font size=-1>Tab 2", new JRadioButton("<html><i>Click me!"));
        add(tabs);
        items[1].setToolTipText("<html><center>Dummy Item<br><i>No action");
        menus[0].add(items[0]);
        menus[1].add(items[1]);
        JMenuBar mb = new JMenuBar();
        mb.add(menus[0]);
        mb.add(menus[1]);
        setJMenuBar(mb);
    }
}


public class E30_HTMLComponents {
    public static void main(String args[]) {
        run(new HTMLComponents(), 180, 200);
    }
}
