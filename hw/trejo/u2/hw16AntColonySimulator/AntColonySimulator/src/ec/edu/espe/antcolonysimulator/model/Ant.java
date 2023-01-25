
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Trejo Alex, PACSTORE, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;

    @Override
    public String toString() {
        return "Ant{" + "position=" + getPosition() + ", weight=" + getWeight() + '}';
    }
    
    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }
    
    public void run(){
        System.out.println("Running");
    }
    
    public void carryinFood(){
        System.out.println("Carrying");
    }
    
    public void createPheromone(){
        System.out.println("Pheromone Droping");
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
