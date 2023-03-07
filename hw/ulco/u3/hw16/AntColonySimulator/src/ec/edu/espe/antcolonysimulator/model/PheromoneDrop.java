
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class PheromoneDrop {

    int currentLevel;

    public static void run() {
    }

    public PheromoneDrop() {
        this.currentLevel = 0;
    }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + getCurrentLevel() + '}';
    }

    /**
     * @return the currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * @param currentLevel the currentLevel to set
     */
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

}
