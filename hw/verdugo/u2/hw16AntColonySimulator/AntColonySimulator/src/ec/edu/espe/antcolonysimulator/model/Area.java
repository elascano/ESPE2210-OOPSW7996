
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Area {
    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private ArrayList<AntEater> antEaters;
    private ArrayList<Colony> colonys;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<Cell> cells;

    public Area(int width, int height, int initNumberOfFoodPiles, int par3, ArrayList<AntEater> antEaters, ArrayList<Colony> colonys, ArrayList<FoodPile> foodPiles, ArrayList<Cell> cells) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.antEaters = antEaters;
        this.colonys = colonys;
        this.foodPiles = foodPiles;
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + getWidth() + ", height=" + getHeight() + ", initNumberOfFoodPiles=" + getInitNumberOfFoodPiles() + ", antEaters=" + getAntEaters() + ", colonys=" + getColonys() + ", foodPiles=" + getFoodPiles() + ", cells=" + getCells() + '}';
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the initNumberOfFoodPiles
     */
    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    /**
     * @param initNumberOfFoodPiles the initNumberOfFoodPiles to set
     */
    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

    /**
     * @return the antEaters
     */
    public ArrayList<AntEater> getAntEaters() {
        return antEaters;
    }

    /**
     * @param antEaters the antEaters to set
     */
    public void setAntEaters(ArrayList<AntEater> antEaters) {
        this.antEaters = antEaters;
    }

    /**
     * @return the colonys
     */
    public ArrayList<Colony> getColonys() {
        return colonys;
    }

    /**
     * @param colonys the colonys to set
     */
    public void setColonys(ArrayList<Colony> colonys) {
        this.colonys = colonys;
    }

    /**
     * @return the foodPiles
     */
    public ArrayList<FoodPile> getFoodPiles() {
        return foodPiles;
    }

    /**
     * @param foodPiles the foodPiles to set
     */
    public void setFoodPiles(ArrayList<FoodPile> foodPiles) {
        this.foodPiles = foodPiles;
    }

    /**
     * @return the cells
     */
    public ArrayList<Cell> getCells() {
        return cells;
    }

    /**
     * @param cells the cells to set
     */
    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }
    
    
}
