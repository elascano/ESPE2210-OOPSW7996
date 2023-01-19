package ec.edu.espe.hw15.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class PheromoneDrop {
    private int currentLevel;

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + currentLevel + '}';
    }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    public void run(){
        System.out.println("Run");
    }
}
