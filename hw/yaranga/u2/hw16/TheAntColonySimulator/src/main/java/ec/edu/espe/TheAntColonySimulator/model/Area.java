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
public class Area {

    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    
   private ArrayList<Cell> cells;
  private ArrayList<FoodPile> foodPile;
   private ArrayList<Colony> colonies;
   private ArrayList<AntEater> andEaters;
   
   
           
    public static void setup(){}
    
    public static void add(Colony colony){}
    
    public static void add(AntEater antEater){}
    
    public static void isAnyFoodRemaining(){}
    
    public static void getCell(int row, int col){}

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height=" + height + ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + ", tickDuration=" + tickDuration + ", cells=" + cells + ", foodPile=" + foodPile + ", colonies=" + colonies + ", andEaters=" + andEaters + '}';
    }
  
    
    public Area() {
        this.width = 0;
        this.height = 0;
        this.initNumberOfFoodPiles = 0;
        this.tickDuration = 0;
        this.cells = null;
        this.foodPile = null;
        this.colonies = null;
        this.andEaters = null;
    }

    
    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<Cell> cells, ArrayList<FoodPile> foodPile, ArrayList<Colony> colonies, ArrayList<AntEater> andEaters) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.cells = cells;
        this.foodPile = foodPile;
        this.colonies = colonies;
        this.andEaters = andEaters;
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
     * @return the foodPile
     */
    public ArrayList<FoodPile> getFoodPile() {
        return foodPile;
    }

    /**
     * @param foodPile the foodPile to set
     */
    public void setFoodPile(ArrayList<FoodPile> foodPile) {
        this.foodPile = foodPile;
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
     * @return the andEaters
     */
    public ArrayList<AntEater> getAndEaters() {
        return andEaters;
    }

    /**
     * @param andEaters the andEaters to set
     */
    public void setAndEaters(ArrayList<AntEater> andEaters) {
        this.andEaters = andEaters;
    }
 
    
}
