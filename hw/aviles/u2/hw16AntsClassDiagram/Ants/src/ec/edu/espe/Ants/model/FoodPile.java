/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ants.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class FoodPile {
    private int pileAmount;
    private Cell position;

    public FoodPile(int pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }

    public int getPileAmount() {
        return pileAmount;
    }

    public void setPileAmount(int pileAmount) {
        this.pileAmount = pileAmount;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }
    
    
    public Food yieldFood(int amount){
        Food food;
        food =new Food(amount);
        return food;
    }
}
