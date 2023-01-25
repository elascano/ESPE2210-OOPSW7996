
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class AntEater {
    private Cell position;
    private int antEatenCounter;
    private int runCounter;
    private int state;

    public AntEater(Cell  position, int antEatenCounter, int runCounter, int state) {
        this.position = position;
        this.antEatenCounter = antEatenCounter;
        this.runCounter = runCounter;
        this.state = state;
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + getPosition() + ", antEatenCounter=" + getAntEatenCounter() + ", runCounter=" + getRunCounter() + ", state=" + getState() + '}';
    }
    
    

    public void run(){
        System.out.println("AntEater is running ");
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the antEatenCounter
     */
    public int getAntEatenCounter() {
        return antEatenCounter;
    }

    /**
     * @param antEatenCounter the antEatenCounter to set
     */
    public void setAntEatenCounter(int antEatenCounter) {
        this.antEatenCounter = antEatenCounter;
    }

    /**
     * @return the runCounter
     */
    public int getRunCounter() {
        return runCounter;
    }

    /**
     * @param runCounter the runCounter to set
     */
    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    
    
    
}
