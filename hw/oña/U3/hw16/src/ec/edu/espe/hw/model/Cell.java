package ec.edu.espe.hw.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class Cell {
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public void recivePheromones(PheromoneDrop pheromone){
        System.out.println("Recive: "+pheromone);
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
    
}
