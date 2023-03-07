
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
import ec.edu.espe.antcolonysimulator.model.SimulatorDisplay;
import java.util.ArrayList;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class AntColonySimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AntEater antEater = new AntEater();
        PheromoneDrop pheromoneDrop;
        Food food = new Food();
        FoodPile foodPile = new FoodPile();
        SimulatorDisplay simulatorDisplay;
        Area area;
        Ant ant;
        Cell cell;
        Nest nest;
        
        ArrayList<Colony> colonies = new ArrayList<>();
        ArrayList<FoodPile> foodPiles = new ArrayList<>();
        ArrayList<Cell> cells = new ArrayList<>();
        ArrayList<Food> food1 = new ArrayList<>();
        ArrayList<AntEater> antEaters = new ArrayList<>();
        
        area = new Area(50, 50, 24, 33,colonies,antEaters,cells,foodPiles);
        SimulatorDisplay simulator = new SimulatorDisplay(area);
        cell = new Cell(22, 20);
        nest = new Nest(cell, food1);
        ant = new Ant(cell, 7, food);
        pheromoneDrop = new PheromoneDrop(2);
        
        
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
