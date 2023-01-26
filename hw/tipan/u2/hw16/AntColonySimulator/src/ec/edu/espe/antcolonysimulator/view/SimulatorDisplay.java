
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
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        Area area;
        Ant ant;
        Cell cell;
        Nest nest;
        PheromoneDrop pheromoneDrop;
        ArrayList<Food> food;
        ArrayList<AntEater> antEaters;
        ArrayList<Colony> colonys;
        ArrayList<FoodPile> foodPiles;
        ArrayList<Cell> cells;
        
        antEaters = new ArrayList<>();
        colonys = new ArrayList<>();
        foodPiles = new ArrayList<>();
        cells = new ArrayList<>();
        food = new ArrayList<>();
      
        area = new Area(200, 200, 1, 4, antEaters, colonys, foodPiles, cells);
        cell = new Cell(20, 30);
        nest = new Nest(cell, food);
        ant = new Ant(cell, 8);
        pheromoneDrop = new PheromoneDrop(8.5F);
        
        System.out.println(area);
        System.out.println(cell);
        System.out.println(nest);
        System.out.println(ant);
        System.out.println(pheromoneDrop);
        
        
    }
    
}
