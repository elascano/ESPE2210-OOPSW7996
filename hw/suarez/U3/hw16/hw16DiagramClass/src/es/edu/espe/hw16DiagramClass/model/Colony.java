package es.edu.espe.hw16DiagramClass.model;

import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Colony {

    private ArrayList<Ant> ants;

    public static void run() {
        System.out.println("running...");
    }

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

}
