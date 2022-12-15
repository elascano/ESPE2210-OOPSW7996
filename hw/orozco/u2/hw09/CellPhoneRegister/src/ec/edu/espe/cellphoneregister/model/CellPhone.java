
package ec.edu.espe.cellphoneregister.model;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class CellPhone {
    
    private int id;
    private String model;
    private String color;
    
    public CellPhone(){
       
        id = 0;
        model = "";
        color = "";
    }
    
    @Override
    public String toString(){
        
        return "CellPhone{" + "id =" + getId() + ", model = " + getModel() + ", color = " + getColor() + "}";
        
    }
    
    public CellPhone(int id, String model, String color){
        
        this.id = id;
        this.model = model;
        this.color = color;
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
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
       
}
