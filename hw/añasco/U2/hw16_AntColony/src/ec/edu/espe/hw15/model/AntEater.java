package ec.edu.espe.hw15.model;

/**
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class AntEater {
    private Cell position;
    private int antEatenCounter;
    private int runCounter;
    private int state;

    public AntEater(Cell position, int antEatenCounter, 
            int runCounter, int state) {
        this.position = position;
        this.antEatenCounter = antEatenCounter;
        this.runCounter = runCounter;
        this.state = state;
    }

    public void run(){
        System.out.println("The ant eater is running!");
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + position + 
        ", antEatenCounter=" + antEatenCounter + 
        ", runCounter=" + runCounter + ", state=" + state + '}';
    }
    
    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getAntEatenCounter() {
        return antEatenCounter;
    }

    public void setAntEatenCounter(int antEatenCounter) {
        this.antEatenCounter = antEatenCounter;
    }

    public int getRunCounter() {
        return runCounter;
    }

    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
       
    
}
