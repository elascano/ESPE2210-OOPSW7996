package ec.edu.espe.hw15.model;

import java.util.ArrayList;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Area {
    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    private ArrayList<Colony> colonies;
    private ArrayList<AntEater> antEaters;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<Cell> cells;

    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Colony> colonies, ArrayList<AntEater> antEaters, ArrayList<FoodPile> foodPiles, ArrayList<Cell> cells) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.colonies = colonies;
        this.antEaters = antEaters;
        this.foodPiles = foodPiles;
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height=" + height + ", initNumberOfFoodPiles=" 
        + initNumberOfFoodPiles + ", tickDuration=" + tickDuration + ", colonies=" + colonies 
        + ", antEaters=" + antEaters + ", foodPiles=" + foodPiles + ", cells=" + cells + '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

    public int getTickDuration() {
        return tickDuration;
    }

    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    public ArrayList<Colony> getColonies() {
        return colonies;
    }

    public void setColonies(ArrayList<Colony> colonies) {
        this.colonies = colonies;
    }

    public ArrayList<AntEater> getAntEaters() {
        return antEaters;
    }

    public void setAntEaters(ArrayList<AntEater> antEaters) {
        this.antEaters = antEaters;
    }

    public ArrayList<FoodPile> getFoodPiles() {
        return foodPiles;
    }

    public void setFoodPiles(ArrayList<FoodPile> foodPiles) {
        this.foodPiles = foodPiles;
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }
    
    
}
