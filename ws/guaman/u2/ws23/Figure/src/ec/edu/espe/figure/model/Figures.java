package ec.edu.espe.figure.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public abstract class Figures {

    private ArrayList<Shape> shapes = new ArrayList();;

    public Figures() {
    }

    @Override
    public String toString() {
        return "Figures{" + "shapes=" + shapes + '}';
    }
    
    /**
     * @return the shapes
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    /**
     * @param shapes the shapes to set
     */
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
}
