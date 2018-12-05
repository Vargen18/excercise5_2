package tda551;

/* This is now all we (can) use from the sub-package */

//import tda551.polygons.polygon.*;

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the tda551.shapes package.
 */
import tda551.adapter.*;

import javax.swing.*;
import java.awt.Graphics;
import java.util.*;
import tda551.mvc.*;

public class DrawPolygons extends JComponent {
    public boolean direction = true;
    public int ticker = 0;
    public JFrame frame;







    public static void main(String[] args) {
        PolygonController controller = new PolygonController();
        PolygonModel model = new PolygonModel();
        PolygonView view = new PolygonView();

        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        view.frame = frame;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

        try {
            while (true) {
                Thread.sleep(500);
                controller.update();
            }
        } catch (InterruptedException e) {
        }
    }
}