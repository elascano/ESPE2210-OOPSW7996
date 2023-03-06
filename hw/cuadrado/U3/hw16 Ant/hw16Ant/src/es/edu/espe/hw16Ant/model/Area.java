package es.edu.espe.hw16Ant.model;
import java.util.ArrayList;
/**
 *
 * @author Alejandro Cuadrado, Developer Bears,DCCO-ESPE
 */
public class Area {
    private int width;
    private int height;
    private int initNumberOfFoodPiles;
    private int tickDuration;
    ArrayList<FoodPile> foodPiles;
    ArrayList<Colony> colonies;
    ArrayList<AntEater> antEaters;
    ArrayList<Cell> cells;
    public static void setup() {
    }
    public static void add(Colony colony) {
    }
    public static void add(AntEater antEater) {
    }
    public static void isAnyFoodRemaining() {
    }
    public static void getCell(int row, int col) {
    }
    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height=" + height + ", initNumberOfFoodPiles=" + initNumberOfFoodPiles + ", tickDuration=" + tickDuration + ", foodPiles=" + foodPiles + ", colonies=" + colonies + ", antEaters=" + antEaters + ", cells=" + cells + '}';
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
    public ArrayList<FoodPile> getFoodPiles() {
        return foodPiles;
    }
    public void setFoodPiles(ArrayList<FoodPile> foodPiles) {
        this.foodPiles = foodPiles;
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
    public ArrayList<Cell> getCells() {
        return cells;
    }
    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }
    public Area(int width, int height, int initNumberOfFoodPiles, int tickDuration, ArrayList<FoodPile> foodPiles, ArrayList<Colony> colonies, ArrayList<AntEater> antEaters, ArrayList<Cell> cells) {
        this.width = width;
        this.height = height;
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
        this.tickDuration = tickDuration;
        this.foodPiles = foodPiles;
        this.colonies = colonies;
        this.antEaters = antEaters;
        this.cells = cells;
    }
}