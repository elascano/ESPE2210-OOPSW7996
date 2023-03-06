/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.Ants.view;

import ec.edu.espe.Ants.model.Ant;
import ec.edu.espe.Ants.model.AntEater;
import ec.edu.espe.Ants.model.Area;
import ec.edu.espe.Ants.model.Cell;
import ec.edu.espe.Ants.model.Colony;
import ec.edu.espe.Ants.model.Food;
import ec.edu.espe.Ants.model.FoodPile;
import ec.edu.espe.Ants.model.Nest;
import ec.edu.espe.Ants.model.PheromoneDrop;
import java.util.ArrayList;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class SimulatorDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Area area;
        Ant ant;
        Cell cell;
        Nest nest;
        PheromoneDrop pheromoneDrop;
        FoodPile foodPile;
        Colony colony;
        Food food[];
        AntEater antEater;
        
        ArrayList<Ant> ants;
        ArrayList<Colony> colonies;
        ArrayList<FoodPile> foodPiles;
        ArrayList<AntEater> antEaters;
        ArrayList<Cell> cells;
        ArrayList<Food> foods;
        
        ants = new ArrayList<Ant>();
        colonies = new ArrayList<Colony>();
        foodPiles = new ArrayList<FoodPile>();
        antEaters = new ArrayList<AntEater>();
        cells = new ArrayList<Cell>();
        foods = new ArrayList<Food>();
        
        
        food = new Food[5];
        cell = new Cell(10,10);
        cells.add(cell);
        
        ant = new Ant(cell, 5, food);
        
        foodPile = new FoodPile(1,cell);
        foodPiles.add(foodPile);
        
        antEater = new AntEater(cell,2,3);
        antEaters.add(antEater);
        
        ants.add(ant);
        colony = new Colony(ants);
        colonies.add(colony);
        
        area = new Area(200,200,1,3,colonies,foodPiles, antEaters, cells);
        System.out.println(""+area.toString());
    }
    
}
