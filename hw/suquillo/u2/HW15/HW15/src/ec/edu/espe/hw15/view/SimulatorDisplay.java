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
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class SimulatorDisplay {
    public static void main(String[] args){
        Ant ant;
        AntEater antEater;
        Area area;
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

        area = new Area(10,20,5,2);
    }
    
}
