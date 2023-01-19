package es.edu.espe.hw16DiagramClass.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class PheromoneDrop {

    private int currentLevel;

    public static void run() {
        System.out.println("running...");
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + currentLevel + '}';
    }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }

}
