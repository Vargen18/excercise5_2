package tda551.mvc;

import tda551.adapter.IPolygon;
import tda551.adapter.PolygonFactory;
import tda551.shapes.Polygon;

import java.util.ArrayList;

public class PolygonModel {

    public ArrayList<IPolygon> polygons;

    public PolygonModel() {
        polygons = new ArrayList<>(10);

        polygons.add(PolygonFactory.createSquare(50, 50));
        polygons.add(PolygonFactory.createTriangle(100, 100));
        polygons.add(PolygonFactory.createRectangle(50, 150));

    }//constructor

    void updateCenters(int value){
        for (IPolygon p : polygons) {
            p.updateCenter(p.getCenter().x + value, p.getCenter().y + value); //model?
        }
    }
}
