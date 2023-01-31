package ec.edu.espe.hw15.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }
    
    public void run(){
        System.out.println("The ant is running");
    }
    
    public void carry(){
        System.out.println("The ant is carrying food");
    }
}
