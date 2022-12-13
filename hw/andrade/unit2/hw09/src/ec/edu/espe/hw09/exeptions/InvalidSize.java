
package ec.edu.espe.hw09.exeptions;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class InvalidSize extends Exception{
    private int id;
    
    public InvalidSize(int id){
        super("The size is not valid: " + id);
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
}
