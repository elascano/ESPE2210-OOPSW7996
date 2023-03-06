package es.edu.espe.hw16Ant.model;
/**
 *
 * @author Alejandro Cuadrado, Developer Bears,DCCO-ESPE
 */
public class AntEater {
    private Cell position;
    private int antEatenCounter;
    private enum state {
    };
    public static void run() {
        System.out.println("running...");
    }
    @Override
    public String toString() {
        return "AntEater{" + "position=" + position + ", antEatenCounter=" + antEatenCounter + '}';
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
    public AntEater(Cell position, int antEatenCounter) {
        this.position = position;
        this.antEatenCounter = antEatenCounter;
    }
}