package ec.edu.espe.antcolonysimulator.view;

import ec.edu.espe.antcolonysimulator.model.Ant;
import ec.edu.espe.antcolonysimulator.model.AntEater;
import ec.edu.espe.antcolonysimulator.model.Area;
import ec.edu.espe.antcolonysimulator.model.Cell;
import ec.edu.espe.antcolonysimulator.model.Colony;
import ec.edu.espe.antcolonysimulator.model.Food;
import ec.edu.espe.antcolonysimulator.model.FoodPile;
import ec.edu.espe.antcolonysimulator.model.Nest;
import ec.edu.espe.antcolonysimulator.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class SimulatorDisplay {

    public static void main(String[] args) {
        Area area;
        AntEater antEater;
        Ant ant;
        Cell cell;
        Colony colony;
        FoodPile foodPile;
        Nest nest;
        PheromoneDrop pheromoneDrop;

        ArrayList<AntEater> antEaters;
        ArrayList<Ant> ants;
        ArrayList<Cell> cells;
        ArrayList<Colony> colonies;
        ArrayList<Food> food;
        ArrayList<FoodPile> foodPiles;

        antEaters = new ArrayList<>();
        colonies = new ArrayList<>();
        foodPiles = new ArrayList<>();
        cells = new ArrayList<>();
        food = new ArrayList<>();

        area = new Area(50, 50, 23, 12, antEaters, colonies, foodPiles, cells);
        cell = new Cell(10, 15);
        nest = new Nest(cell, food);
        ant = new Ant(cell, 5);
        pheromoneDrop = new PheromoneDrop(9);

        System.out.println(area);
        System.out.println(cell);
        System.out.println(nest);
        System.out.println(ant);
        System.out.println(pheromoneDrop);
    }
}
