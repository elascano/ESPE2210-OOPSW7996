
package ec.edu.espe.hw09.exeptions;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class InvalidId extends Exception{
    private int id;
    
    public InvalidId(int id){
        super("Invalid Id: " + id);
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
}
