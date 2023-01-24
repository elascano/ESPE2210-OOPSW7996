
package ec.edu.espe.antcolonysimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Colony {
    private ArrayList<Ant> ants;

    public Colony(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    @Override
    public String toString() {
        return "Colony{" + "ants=" + getAnts() + '}';
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
