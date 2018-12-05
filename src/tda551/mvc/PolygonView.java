package tda551.mvc;

import tda551.adapter.IPolygon;
import tda551.shapes.Polygon;

import javax.swing.*;
import java.awt.*;

public class PolygonView extends JComponent {

    private JFrame frame;
    private PolygonModel model;

    PolygonView(PolygonModel model){
        this.model = model;
        this.frame = new JFrame();
        frame.getContentPane().add(this);
    }

    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : model.polygons) {
            currentPolygon.paint(g);
        }
    }//paint

    JFrame getFrame(){
        return frame;
    }
}
