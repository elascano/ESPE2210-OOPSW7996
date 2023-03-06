package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AntEater {

    private int antEaterCounter;
    private int runCounter;
    private int state;
    private Cell position;

    public static void run() {
        System.out.println("Run");
    }

    public AntEater() {
        this.antEaterCounter = 0;
        this.runCounter = 0;
        this.state = 0;
        this.position = null;

    }

    public AntEater(int antEatenCounter, int runCounter, int state, Cell position) {
        this.antEaterCounter = antEatenCounter;
        this.runCounter = runCounter;
        this.state = state;
        this.position = position;
    }

    @Override
    public String toString() {
        return "AntEater{" + "antEatenCounter=" + getAntEatenCounter() + ", runCounter=" + getRunCounter() + ", state=" + getState() + ", position=" + getPosition() + '}';
    }

    /**
     * @return the antEaterCounter
     */
    public int getAntEatenCounter() {
        return antEaterCounter;
    }

    /**
     * @param antEatenCounter the antEaterCounter to set
     */
    public void setAntEatenCounter(int antEatenCounter) {
        this.antEaterCounter = antEatenCounter;
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

    

}
