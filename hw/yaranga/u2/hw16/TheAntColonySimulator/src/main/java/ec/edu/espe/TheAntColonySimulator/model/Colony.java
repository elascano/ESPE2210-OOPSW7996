
package ec.edu.espe.TheAntColonySimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Colony {

    private Nest nest;
    private ArrayList<Ant> ants;

    public void run() {
        System.out.println("Running");
    }
    
    public void lives() {
        System.out.println("Living");
    }

    @Override
    public String toString() {
        return "Colony{" + "nest=" + nest + ", ants=" + ants + '}';
    }     

    public Colony() {
        this.nest = null;
        this.ants = null;
    }

    public Colony(Nest nest, ArrayList<Ant> ants) {
        this.nest = nest;
        this.ants = ants;
    }

    /**
     * @return the nest
     */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
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
