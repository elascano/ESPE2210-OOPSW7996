package es.edu.espe.hw16Ant.view;
import es.edu.espe.hw16Ant.model.Ant;
import es.edu.espe.hw16Ant.model.AntEater;
import es.edu.espe.hw16Ant.model.Area;
import es.edu.espe.hw16Ant.model.Cell;
import es.edu.espe.hw16Ant.model.Colony;
import es.edu.espe.hw16Ant.model.Food;
import es.edu.espe.hw16Ant.model.FoodPile;
import es.edu.espe.hw16Ant.model.Nest;
import es.edu.espe.hw16Ant.model.PheromoneDrop;
import java.util.ArrayList;
/**
 *
 * @author Alejandro Cuadrado, Developer Bears,DCCO-ESPE
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        Area area;
        Ant ant;
        Cell cell;
        Colony colony;
        Nest nest;
        PheromoneDrop pheromoneDrop;
        ArrayList<Food> food;
        ArrayList<Ant> ants;
        ArrayList<AntEater> antEaters;
        ArrayList<Colony> colonies;
        ArrayList<FoodPile> foodPile;
        ArrayList<Cell> cells;
        ArrayList<PheromoneDrop> pheromoneDrops;
        pheromoneDrops = new ArrayList<>();
        food = new ArrayList<>();
        antEaters = new ArrayList<>();
        colonies = new ArrayList<>();
        foodPile = new ArrayList<>();
        cells = new ArrayList<>();
        ants = new ArrayList<>();
        Food[] foods = new Food[5];
        cell = new Cell(10, 10, pheromoneDrops);
        cells.add(cell);
        ant = new Ant(cell, 10, foods);
        ants.add(ant);
        FoodPile foodPiles = new FoodPile(10.00F, cell);
        foodPile.add(foodPiles);
        AntEater antEater = new AntEater(cell, 0);
        antEaters.add(antEater);
        colony = new Colony(ants);
        colonies.add(colony);
        area = new Area(80, 10, 5, 6, foodPile, colonies, antEaters, cells);
        System.out.println("" + area.toString());
    }
}