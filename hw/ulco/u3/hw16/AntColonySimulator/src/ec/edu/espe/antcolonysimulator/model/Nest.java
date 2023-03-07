
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Nest {

    Cell position;
    ArrayList<Food> foods;

    public Nest() {
        this.position = null;
        this.foods = null;
    }

    public Nest(Cell position, ArrayList<Food> food) {
        this.position = position;
        this.foods = food;
    }

    @Override
    public String toString() {
        return "Nest{" + "position=" + getPosition() + ", food=" + getFood() + '}';
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
     * @return the foods
     */
    public ArrayList<Food> getFood() {
        return foods;
    }

    /**
     * @param food the foods to set
     */
    public void setFood(ArrayList<Food> food) {
        this.foods = food;
    }

}
