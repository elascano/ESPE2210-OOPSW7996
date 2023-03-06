/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ants.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Nest {
    private Cell position;
    private ArrayList<Food> stockPile;

    public Nest(Cell position, ArrayList<Food> stockPile) {
        this.position = position;
        this.stockPile = stockPile;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public ArrayList<Food> getStockPile() {
        return stockPile;
    }

    public void setStockPile(ArrayList<Food> stockPile) {
        this.stockPile = stockPile;
    }
    
}
