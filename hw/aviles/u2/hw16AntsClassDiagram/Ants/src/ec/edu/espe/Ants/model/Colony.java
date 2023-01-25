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
public class Colony {
    private ArrayList<Ant> Ants;

    public Colony(ArrayList<Ant> Ants) {
        this.Ants = Ants;
    }

    public ArrayList<Ant> getAnts() {
        return Ants;
    }

    public void setAnts(ArrayList<Ant> Ants) {
        this.Ants = Ants;
    }
    
    public void run(){
        
    }
}
