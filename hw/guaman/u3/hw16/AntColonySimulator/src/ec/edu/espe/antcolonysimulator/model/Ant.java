package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
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

    public void run() {
        System.out.println("Ant running");
    }

    public PheromoneDrop createPheromone() {
        PheromoneDrop pheromoneDrop;
        
        pheromoneDrop = new PheromoneDrop(10);
        
        return pheromoneDrop;
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
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

}
