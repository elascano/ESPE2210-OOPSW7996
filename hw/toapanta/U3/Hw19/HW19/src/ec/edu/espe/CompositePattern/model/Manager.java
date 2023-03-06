package ec.edu.espe.CompositePattern.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
class Manager extends Supervisor {
    public Manager(String aName){
        this();
        name = aName;
    }
    
    public Manager(){
        super();
        title = "Manager";
    }
    
    public void stateName(){
        super.stateName();
    }
}
