
package ec.edu.espe.TheAntColonySimulator.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Cell{
    private int row;
    private int col;
    
    public static void receivePheromone(PheromoneDrop pheromne){};
    
    public static List<Ant> getAnts(){
        ArrayList<Ant> ants =new ArrayList<>();
        
        return ants;
    }

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + '}';
    }

    
     public Cell() {
        this.row = 0;
        this.col = 0;
    }
    
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
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
