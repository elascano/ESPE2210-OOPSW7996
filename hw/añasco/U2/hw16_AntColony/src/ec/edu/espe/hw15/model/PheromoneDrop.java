package ec.edu.espe.hw15.model;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class PheromoneDrop {
    private int currentLevel;

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
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
    
    public void run(){
        System.out.println("Run");
    }
}
