import net.mindview.util.DaemonThreadPoolExecutor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import section_14.SWTApplication;
import section_14.SWTConsole;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class CStar extends Canvas implements Runnable {
    class CStarPaintListener implements PaintListener {
        public void paintControl(PaintEvent e) {
            Color color = new Color(e.display, cColor);
            e.gc.setBackground(color);
            Point size = getSize();
            int width = size.x;
            int height = size.y;
            // The coordinates of the centre of the star:
            int centreX = width / 2;
            int centreY = height / 2;
            // The distance from the centre to points of the star
            // and to the inner core of the star, respectively:
            int outerRing, innerRing;
            if (width < height) {
                innerRing = width / 8;
                outerRing = width / 2;
            } else {
                innerRing = height / 8;
                outerRing = height / 2;
            }
            int d;
            int idx;
            for (int i = 0; i < num_points * 2; i++) {
                d = (i % 2 == 0) ? innerRing : outerRing;
                idx = i * 2;
                p[idx] = centreX + (int) (d * dx[i]);
                p[idx + 1] = centreY + (int) (d * dy[i]);
            }
            e.gc.fillPolygon(p);
            color.dispose();
        }
    }


    static Random rand = new Random();

    private static RGB newColor() {
        return new RGB(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

    private final int pause;
    private RGB cColor = newColor();
    private final int num_points;
    // Fields used by the drawing algorithm:
    private final int[] p;
    private final double[] dx;
    private final double[] dy;

    public CStar(Composite parent, int num_points, int pause) {
        super(parent, SWT.NONE);
        this.num_points = num_points;
        this.pause = pause;
        addPaintListener(new CStarPaintListener());
        p = new int[num_points * 4];
        dx = new double[num_points * 2];
        dy = new double[num_points * 2];
        // Cache calculated data:
        double delta = Math.PI / num_points;
        for (int i = 0; i < num_points * 2; i++) {
            dx[i] = Math.cos(delta * i);
            dy[i] = Math.sin(delta * i);
        }
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                cColor = newColor();
                getDisplay().asyncExec(new Runnable() {
                    public void run() {
                        try {
                            redraw();
                        } catch (SWTException e) {
                        }
                        // SWTException is OK when the parent
                        // is terminated from under us.
                    }
                });
                TimeUnit.MILLISECONDS.sleep(pause);
            }
        } catch (InterruptedException e) {
            // Acceptable way to exit
        } catch (SWTException e) {
            // Acceptable way to exit: our parent
            // was terminated from under us.
        }
    }
}


public class E42_ColorStars2 implements SWTApplication {
    private int grid = 12;
    private int pause = 50;

    public void createContents(Composite parent) {
        GridLayout gridLayout = new GridLayout(grid, true);
        gridLayout.horizontalSpacing = 0;
        gridLayout.verticalSpacing = 0;
        parent.setLayout(gridLayout);
        ExecutorService exec = new DaemonThreadPoolExecutor();
        for (int i = 0; i < (grid * grid); i++) {
            final CStar cs = new CStar(parent, CStar.rand.nextInt(12) + 3, pause);
            cs.setLayoutData(new GridData(GridData.FILL_BOTH));
            exec.execute(cs);
        }
    }

    public static void main(String[] args) {
        E42_ColorStars2 stars = new E42_ColorStars2();
        if (args.length > 0)
            stars.grid = new Integer(args[0]);
        if (args.length > 1)
            stars.pause = new Integer(args[1]);
        SWTConsole.run(stars, 500, 400);
    }
}
