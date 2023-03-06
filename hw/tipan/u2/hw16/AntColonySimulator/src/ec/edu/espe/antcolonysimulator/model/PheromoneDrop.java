
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class PheromoneDrop {
    private float currentLevel;

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + getCurrentLevel() + '}';
    }

    public PheromoneDrop(float currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    public void run(){
        System.out.println("Run in Pheromone");
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
