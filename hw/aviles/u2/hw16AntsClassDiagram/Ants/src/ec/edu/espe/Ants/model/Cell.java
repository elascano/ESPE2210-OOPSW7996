/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ants.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Cell {
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
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
    
    
    
    public void recievePheromone(PheromoneDrop Pheromone){
        
    }
    
    public List<Ant> getAnts(){
        List<Ant> ants;
        ants = new ArrayList<Ant>();
        return ants;
    }
}
