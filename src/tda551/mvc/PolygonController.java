package tda551.mvc;

import tda551.adapter.IPolygon;

public class PolygonController {

    private final PolygonModel model = new PolygonModel();
    private final PolygonView view = new PolygonView();

    public void update() {
        ticker++;
        int value = direction ? 10 : -10; //TODO Should it be in controller or model?
        updateCenters();

        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
        repaint();
    }

    public void repaint(){
        PolygonView.repaint();
    }

    private void updateCenters(){
        model.updateCenters();
    }
}
