package es.edu.espe.hw16DiagramClass.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Cell {

    private int row;
    private int col;
    public ArrayList<PheromoneDrop> pheromoneDrops;

    public static void receivePheromone(PheromoneDrop pheromoneDrop) {
        System.out.println("receivePheromone:" + pheromoneDrop);
    }

    public List<Ant> getAnts() {
        List<Ant> ants;
        ants = new ArrayList<Ant>();
        return ants;
    }

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + ", pheromoneDrops=" + pheromoneDrops + '}';
    }

    public Cell(int row, int col, ArrayList<PheromoneDrop> pheromoneDrops) {
        this.row = row;
        this.col = col;
        this.pheromoneDrops = pheromoneDrops;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public ArrayList<PheromoneDrop> getPheromoneDrops() {
        return pheromoneDrops;
    }

    public void setPheromoneDrops(ArrayList<PheromoneDrop> pheromoneDrops) {
        this.pheromoneDrops = pheromoneDrops;
    }

}
