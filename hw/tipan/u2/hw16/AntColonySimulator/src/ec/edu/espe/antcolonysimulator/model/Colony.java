
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Colony {
    private ArrayList<Ant> ants;

    @Override
    public String toString() {
        return "Colony{" + "ants=" + getAnts() + '}';
    }
    
    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    public void run(){
        System.out.println("Colony is running");
    }

    /**
     * @return the ants
     */
    public ArrayList<Ant> getAnts() {
        return ants;
    }

    /**
     * @param ants the ants to set
     */
    public void setAnts(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
}
