package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Cell {

    private int row;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + '}';
    }

    public void receivePheromone(PheromoneDrop pheromoneDropo) {
        System.out.println("receivePheromone: " + pheromoneDropo);
    }

    public List<Ant> getAnts() {
        List<Ant> ants;

        ants = new ArrayList<Ant>();

        return ants;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

}
