package ec.edu.espe.hw15.view;

import ec.edu.espe.hw15.model.Ant;
import ec.edu.espe.hw15.model.AntEater;
import ec.edu.espe.hw15.model.Area;
import ec.edu.espe.hw15.model.Cell;
import ec.edu.espe.hw15.model.Colony;
import ec.edu.espe.hw15.model.Food;
import ec.edu.espe.hw15.model.FoodPile;
import ec.edu.espe.hw15.model.Nest;
import ec.edu.espe.hw15.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        Area area;
        AntEater antEater;
        Ant ant;
        Cell cell;
        Colony colony;
        Food food;
        FoodPile foodPile;
        Nest nest;
        PheromoneDrop pheromoneDrop;
        
        ArrayList<AntEater> antEaters;
        ArrayList<Ant> ants;
        ArrayList<Cell> cells;
        ArrayList<Colony> colonies;
        ArrayList<Food> foods;
        ArrayList<FoodPile> foodPiles;
        
        antEaters = new ArrayList<>();
        ants = new ArrayList<>();
        cells = new ArrayList<>();
        colonies = new ArrayList<>();
        foods = new ArrayList<>();
        foodPiles = new ArrayList<>();
        
        area = new Area(10, 20,
                5, 2, 
                colonies, antEaters, foodPiles,cells);
        cell = new Cell(10, 20);
        antEater = new AntEater(cell, 5,
                3, 1);
        ant = new Ant(cell,1);
        colony = new Colony(ants);
        food = new Food(35);
        foodPile = new FoodPile(7, cell);
        nest = new Nest(cell, foods);
        pheromoneDrop = new PheromoneDrop(12);
        
        System.out.println("----Results----");
        System.out.println("Area --> " + area);
        System.out.println("Cell --> " + cell);
        System.out.println("Ant eater --> " + antEater);
        System.out.println("Ant --> " + ant);
        System.out.println("Colony --> " + colony);
        System.out.println("Food --> " + food);
        System.out.println("Food Pile --> " + foodPile);
        System.out.println("Nest --> " + nest);
        System.out.println("Pheromone Drop --> " 
        + pheromoneDrop);
    }
}
