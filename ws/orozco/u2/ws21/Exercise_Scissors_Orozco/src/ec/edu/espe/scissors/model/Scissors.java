
package ec.edu.espe.scissors.model;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class Scissors {

    private int id;
    private String color;
    private String type;
    
    @Override
    public String toString(){
       
       return "SdCard{" + "id=" + getId() + ", brand=" + getColor() + ", capacity=" + getType() + '}';
                
    }
    
    public Scissors(){
        
        id = 0;
        color = "";
        type = "";
    }
    
    public Scissors(int id, String color, String type){
        
        this.id = id;
        this.color = color; 
        this.type = type;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    
    
    
}
