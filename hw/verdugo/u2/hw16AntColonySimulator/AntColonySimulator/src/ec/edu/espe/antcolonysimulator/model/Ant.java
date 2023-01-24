/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Ant {

    private Cell position;
    private int weight;

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }
    
    public void run(){
        System.out.println("Ant running-> ");
    }
    
    public PheromoneDrop createPheromone(){
        PheromoneDrop pheromoneDrop;
        
        pheromoneDrop = new PheromoneDrop(10);
        
        return pheromoneDrop;
    
    }
}
