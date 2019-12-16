import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

import static section_02.SwingConsole.run;

/**
 * @Author ZhangGJ
 * @Date 2019/10/07
 */
class SketchArea extends JPanel {
    java.util.List<Point> points = new ArrayList<Point>();


    class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void addPoint(int x, int y) {
        points.add(new Point(x, y));
        repaint();
    }

    public void clear() {
        points.clear();
        repaint();
    }

    Point previousPoint;

    void drawPoint(Graphics g, Point p) {
        // So that it starts from anywhere, rather
        // than drawing from 0, 0:
        if (previousPoint == null) {
            previousPoint = p;
            return;
        }
        g.drawLine(previousPoint.x, previousPoint.y, p.x, p.y);
        previousPoint = p;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        previousPoint = null;
        for (Point p : points)
            drawPoint(g, p);
    }
}


class SketchBox extends JFrame {
    SketchArea sketch = new SketchArea();
    JSlider hAxis = new JSlider(), vAxis = new JSlider(JSlider.VERTICAL);
    JButton erase = new JButton("Erase");
    ChangeListener cl = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            sketch.addPoint(hAxis.getValue(), vAxis.getValue());
            erase.setText("[Erase]   points.size() = " + sketch.points.size());
        }
    };

    public SketchBox() {
        add(sketch);
        hAxis.setValue(0);
        vAxis.setValue(0);
        // So vertical axis synchronizes with line:
        vAxis.setInverted(true);
        hAxis.addChangeListener(cl);
        vAxis.addChangeListener(cl);
        add(BorderLayout.SOUTH, hAxis);
        add(BorderLayout.WEST, vAxis);
        add(BorderLayout.NORTH, erase);
        erase.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sketch.clear();
                erase.setText("[Erase]   points.size() = " + sketch.points.size());
            }
        });
        // The width and height values are zero until
        // initial resizing (when the component is
        // first drawn). Also takes care of things
        // if it's resized:
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                hAxis.setMaximum(sketch.getWidth());
                vAxis.setMaximum(sketch.getHeight());
            }
        });
    }
}


public class E24_SketchBox {
    public static void main(String args[]) {
        run(new SketchBox(), 700, 400);
    }
}
