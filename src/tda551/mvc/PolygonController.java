package tda551.mvc;

import tda551.adapter.IPolygon;

import javax.swing.*;

public class PolygonController {

    private final PolygonModel model;
    private final PolygonView view;
    private int ticker;
    private boolean direction;

    public PolygonController() {
        model = new PolygonModel();
        view = new PolygonView(model);
        ticker = 0;
        direction = true;
    }

    public void update() {
        ticker++;
        int value = direction ? 10 : -10; //TODO Should it be in controller or model?
        updateCenters(value);

        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
        repaint();
    }

    public void repaint() {
        view.repaint();
    }

    private void updateCenters(int value) {
        model.updateCenters(value);
    }

    public JFrame getFrame(){
        view.getFrame();
    }
}
