
package ec.edu.espe.TheAntColonySimulator.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AntEater {

    private Cell position;
    private int antEatenCounter;
    private int runCounter;
    private int state;

    public static void run() {
        System.out.println("Running...");
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + position + ", antEatenCounter=" + antEatenCounter + ", runCounter=" + runCounter + ", state=" + state + '}';
    }

    
     public AntEater() {
        this.position = null;
        this.antEatenCounter = 0;
        this.runCounter = 0;
        this.state = 0;
    }
     
    public AntEater(Cell position, int antEatenCounter, int runCounter, int State) {
        this.position = position;
        this.antEatenCounter = antEatenCounter;
        this.runCounter = runCounter;
        this.state = State;
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
     * @param State the state to set
     */
    public void setState(int State) {
        this.state = State;
    }

  

}
