package ec.edu.espe.TheAntColonySimulator.view;

import ec.edu.espe.TheAntColonySimulator.model.*;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class TheAntColonySimulator {

    public static void main(String[] args) {
        SimulatorDisplay simulatorDisplay;
        Area area;
        Ant ant;
        Cell cell;
        Nest nest;
        AntEater antEater;
        PheromoneDrop pheromoneDrop;
        Food food;
        FoodPile foodPile;

        food = new Food();
        antEater = new AntEater();
        foodPile = new FoodPile();

        ArrayList<Food> food1 = new ArrayList<>();
        ArrayList<AntEater> antEaters = new ArrayList<>();
        ArrayList<Colony> colonies = new ArrayList<>();
        ArrayList<FoodPile> foodPiles = new ArrayList<>();
        ArrayList<Cell> cells = new ArrayList<>();

        area = new Area(50, 50, 24, 33, cells, foodPiles, colonies, antEaters);
        cell = new Cell(22, 20);
        nest = new Nest(cell, food1);
        ant = new Ant(cell, 7, food);
        pheromoneDrop = new PheromoneDrop(2);

        SimulatorDisplay simulator = new SimulatorDisplay(area);

        System.out.println(simulator);
        System.out.println(area);
        System.out.println(cell);
        System.out.println(nest);
        System.out.println(ant);
        System.out.println(pheromoneDrop);
        System.out.println(food);
        System.out.println(antEater);
        System.out.println(foodPile);

    }

}
