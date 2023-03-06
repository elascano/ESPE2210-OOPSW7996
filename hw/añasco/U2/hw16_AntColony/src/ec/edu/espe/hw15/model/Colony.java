package ec.edu.espe.hw15.model;
import java.util.ArrayList;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Colony {
    private ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    public ArrayList<Ant> getAnts() {
        return ants;
    }

    public void setAnts(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    @Override
    public String toString() {
        return "Colony{" + "ants=" + ants + '}';
    }
            
    public void run(){
        System.out.println("The colony is running");
    }
}
