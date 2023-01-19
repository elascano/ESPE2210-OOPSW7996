
package ec.edu.espe.TheAntColonySimulator.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Ant {
    
    private Cell position;
    
    private int weight;
    
    private Food food;

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + ", food=" + food + '}';
    }    
    
    public Ant() {
        this.position = null;
        this.weight = 0;
        this.food = food;
    }
    
     public Ant(Cell position, int weight, Food food) {
        this.position = position;
        this.weight = weight;
        this.food = food;
    }
    
    public void run(){
        System.out.println("Running...");
    }
    
    public void caryingFood(){
        System.out.println("Carrying...");
    }
    
    public void createPheromone(){
        System.out.println("Droping pheromone...");
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

    /**
     * @return the food
     */
    public Food getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(Food food) {
        this.food = food;
    } 
    
}
