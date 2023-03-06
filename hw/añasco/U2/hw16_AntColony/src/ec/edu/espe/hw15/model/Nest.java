package ec.edu.espe.hw15.model;
import java.util.ArrayList;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class Nest {
    private Cell position;
    private ArrayList<Food> food;

    public Nest(Cell position, ArrayList<Food> food) {
        this.position = position;
        this.food = food;
    }
    
    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", food=" + food + '}';
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public ArrayList<Food> getFood() {
        return food;
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
}