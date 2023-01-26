package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Area {

    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuaration;
    private ArrayList<AntEater> antEaters;
    private ArrayList<Colony> colonys;
    private ArrayList<FoodPile> foodPiles;
    private ArrayList<Cell> cells;

    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuaration, ArrayList<AntEater> antEaters, ArrayList<Colony> colonys, ArrayList<FoodPile> foodPiles, ArrayList<Cell> cells) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuaration = tickDuaration;
        this.antEaters = antEaters;
        this.colonys = colonys;
        this.foodPiles = foodPiles;
        this.cells = cells;
    }

    public void setup() {
        System.out.println("Area is setting");
    }

    public void add(Colony colony) {
        colonys.add(colony);
        System.out.println("Colony was added to Area");
    }

    public void add(AntEater antEater) {
        antEaters.add(antEater);
        System.out.println("AntEater was added to Area");
    }

    public boolean isAnyFoodRemaining() {
        return false;
    }

    public Cell getCell(int row, int col) {
        Cell cell;
        cell = null;

        for (Cell cell1 : cells) {
            if (cell1.getRow() == row && cell1.getCol() == col) {
                cell = cell1;
                return cell;
            }
        }

        return cell;
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
     * @return the tickDuaration
     */
    public int getTickDuaration() {
        return tickDuaration;
    }

    /**
     * @param tickDuaration the tickDuaration to set
     */
    public void setTickDuaration(int tickDuaration) {
        this.tickDuaration = tickDuaration;
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
