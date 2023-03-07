
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Area {

    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;

    private ArrayList<Colony> colonies;
    private ArrayList<AntEater> antEaters;
    private ArrayList<Cell> cells;
    private ArrayList<FoodPile> foodPiles;
    


    public static void add(AntEater antEater) {
    }

    public static void isAnyFoodRemaining() {
    }

    public static void getCell(int row, int col) {
    }
    
    public static void setup() {
    }

    public static void add(Colony colony) {
    }


    public Area() {
        this.width = 0;
        this.height = 0;
        this.initNumberOfFoodPiles = 0;
        this.tickDuration = 0;
        this.cells = null;
        this.foodPiles = null;
        this.colonies = null;
        this.antEaters = null;
    }

    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Colony> colonies, ArrayList<AntEater> antEaters, ArrayList<Cell> cells, ArrayList<FoodPile> foodPiles) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.colonies = colonies;
        this.antEaters = antEaters;
        this.cells = cells;
        this.foodPiles = foodPiles;
    }

    @Override
    public String toString() {
        return "Area{" + "width=" + getWidth() + ", height=" + getHeight() + ", initNumberOfFoodPiles=" + getInitNumberOfFoodPiles() + ", tickDuration=" + getTickDuration() + ", colonies=" + getColonies() + ", antEaters=" + getAntEaters() + ", cells=" + getCells() + ", foodPiles=" + getFoodPiles() + '}';
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
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }

    /**
     * @return the colonies
     */
    public ArrayList<Colony> getColonies() {
        return colonies;
    }

    /**
     * @param colonies the colonies to set
     */
    public void setColonies(ArrayList<Colony> colonies) {
        this.colonies = colonies;
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

    

}
