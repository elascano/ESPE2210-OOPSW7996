package es.edu.espe.hw16Ant.model;
/**
 *
 * @author Alejandro Cuadrado, Developer Bears,DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;
    private Food food[];
    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + ", food=" + food + '}';
    }
    public static void run() {
        System.out.println("running...");
    }
    public static PheromoneDrop createPheromoneDrop() {
        PheromoneDrop pheromoneDrop = new PheromoneDrop(0);
        return pheromoneDrop;
    }
    public Ant(Cell position, int weight, Food[] food) {
        this.position = position;
        this.weight = weight;
        this.food = food;
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
    public Food[] getFood() {
        return food;
    }
    public void setFood(Food[] food) {
        this.food = food;
    }
}