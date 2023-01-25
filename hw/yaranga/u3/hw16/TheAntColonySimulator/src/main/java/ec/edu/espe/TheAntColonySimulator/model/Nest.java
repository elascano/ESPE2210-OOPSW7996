/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.TheAntColonySimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Nest {

    Cell position;

    ArrayList<Food> food;

    public Nest() {
        this.position = null;
        this.food = null;
    }

    public Nest(Cell position, ArrayList<Food> food) {
        this.position = position;
        this.food = food;
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
