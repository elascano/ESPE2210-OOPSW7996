package ec.edu.espe.hw15.model;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class Cell {
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public void receivePheromone(PheromoneDrop pheromone){
        System.out.println("Receive " + pheromone);
    }
    
    public List<Ant> getAnts(){
        List<Ant> ants;
        ants = new ArrayList<>();
        
        return ants;
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

    @Override
    public String toString() {
        return "Cell{" + "row=" + row + ", col=" + col + '}';
    }
    
}