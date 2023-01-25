/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Ants.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class AntEater {
    private Cell Position;
    private int antEaterCounter;
    private int runCounter;
    private enum state{};

    public AntEater(Cell Position, int antEaterCounter, int runCounter) {
        this.Position = Position;
        this.antEaterCounter = antEaterCounter;
        this.runCounter = runCounter;
    }

    public Cell getPosition() {
        return Position;
    }

    public void setPosition(Cell Position) {
        this.Position = Position;
    }

    public int getAntEaterCounter() {
        return antEaterCounter;
    }

    public void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
    }

    public int getRunCounter() {
        return runCounter;
    }

    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    
    
    
    
    
    public void run(){
        System.out.println("Run");
    }
}
