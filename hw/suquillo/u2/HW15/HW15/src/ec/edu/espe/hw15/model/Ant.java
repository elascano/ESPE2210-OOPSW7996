package ec.edu.espe.hw15.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class Ant {
    private Cell position;
    private int weight;
    
    public void run(){
        System.out.println("The ant is running");
    }
    
    public void carry(){
        System.out.println("The ant is carrying food");
    }
}
