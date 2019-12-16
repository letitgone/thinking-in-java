import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import section_14.SWTApplication;
import section_14.SWTConsole;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
public class E40_DisplayProperties2 implements SWTApplication {
    public void createContents(Composite parent) {
        parent.setLayout(new FillLayout());
        Text text = new Text(parent, SWT.WRAP | SWT.V_SCROLL);
        StringWriter props = new StringWriter();
        System.getProperties().list(new PrintWriter(props));
        text.setText(props.toString());
    }

    public static void main(String[] args) {
        SWTConsole.run(new E40_DisplayProperties2(), 400, 300);
    }
}
