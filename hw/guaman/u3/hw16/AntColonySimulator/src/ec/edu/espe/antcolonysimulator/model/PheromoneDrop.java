package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class PheromoneDrop {

    private float currentLevel;

    public PheromoneDrop(float currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + currentLevel + '}';
    }

    public void run() {
        System.out.println("run in Pheromone");
    }

    /**
     * @return the currentLevel
     */
    public float getCurrentLevel() {
        return currentLevel;
    }

    /**
     * @param currentLevel the currentLevel to set
     */
    public void setCurrentLevel(float currentLevel) {
        this.currentLevel = currentLevel;
    }
}
