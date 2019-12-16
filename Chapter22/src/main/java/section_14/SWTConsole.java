package section_14;

import org.eclipse.swt.widgets.*;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class SWTConsole {
    public static void run(SWTApplication swtApp, int width, int height) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText(swtApp.getClass().getSimpleName());
        swtApp.createContents(shell);
        shell.setSize(width, height);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}
