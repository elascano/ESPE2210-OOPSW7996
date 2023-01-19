package es.edu.espe.hw16DiagramClass.model;

import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Nest {

    private Cell position;
    private ArrayList<Food> food;
    private Colony colony;

    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", food=" + food + ", colony=" + colony + '}';
    }

    public Nest(Cell position, ArrayList<Food> food, Colony colony) {
        this.position = position;
        this.food = food;
        this.colony = colony;
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

    public Colony getColony() {
        return colony;
    }

    public void setColony(Colony colony) {
        this.colony = colony;
    }

}
