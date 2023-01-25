
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Trejo Alex, PACSTORE, DCCO-ESPE
 */
public class Nest {
    private Cell position;
    private ArrayList<Food> food;

    @Override
    public String toString() {
        return "Nest{" + "position=" + getPosition() + ", food=" + getFood() + '}';
    }

    public Nest(Cell position, ArrayList<Food> food) {
        this.position = position;
        this.food = food;
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the food
     */
    public ArrayList<Food> getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
    
    
}
