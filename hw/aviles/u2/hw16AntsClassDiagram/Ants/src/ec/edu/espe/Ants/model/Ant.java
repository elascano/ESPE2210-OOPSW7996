/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ants.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;
    private Food food[];

    public Ant(Cell position, int weight, Food[] food) {
        this.position = position;
        this.weight = weight;
        this.food = food;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Food[] getFood() {
        return food;
    }

    public void setFood(Food[] food) {
        this.food = food;
    }
    
    
    
    public void run(){
        
    }
    public PheromoneDrop createPheromoneDrop(){
        PheromoneDrop pheromoneDrop;
        int currentLevel;
        currentLevel =1;
        pheromoneDrop = new PheromoneDrop(currentLevel);
        return pheromoneDrop;
    }
}
