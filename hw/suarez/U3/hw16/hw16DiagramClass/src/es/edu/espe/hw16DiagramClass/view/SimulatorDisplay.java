package es.edu.espe.hw16DiagramClass.view;

import es.edu.espe.hw16DiagramClass.model.Ant;
import es.edu.espe.hw16DiagramClass.model.AntEater;
import es.edu.espe.hw16DiagramClass.model.Area;
import es.edu.espe.hw16DiagramClass.model.Cell;
import es.edu.espe.hw16DiagramClass.model.Colony;
import es.edu.espe.hw16DiagramClass.model.Food;
import es.edu.espe.hw16DiagramClass.model.FoodPile;
import es.edu.espe.hw16DiagramClass.model.Nest;
import es.edu.espe.hw16DiagramClass.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class SimulatorDisplay {

    /**
     * @param args the command line arguments
     */
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
