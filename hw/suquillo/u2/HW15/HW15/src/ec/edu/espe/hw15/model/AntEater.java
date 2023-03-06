package ec.edu.espe.hw15.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class AntEater {
    private  Cell position;
    private int antEaterCounter;
    private int runCounter;
    private int state;

    public AntEater(Cell position, int antEaterCounter, int runCounter, int state) {
        this.position = position;
        this.antEaterCounter = antEaterCounter;
        this.runCounter = runCounter;
        this.state = state;
    }
    
    public void run(){
        System.out.println("The ant eater is running");
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + position + ", antEaterCounter=" + antEaterCounter + ", runCounter=" + runCounter + ", state=" + state + '}';
    }
    
    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    
}
