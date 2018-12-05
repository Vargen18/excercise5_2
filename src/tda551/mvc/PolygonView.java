package tda551.mvc;

import tda551.adapter.IPolygon;

import javax.swing.*;
import java.awt.*;

public class PolygonView extends JComponent {

    public x frame;

    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint
}
