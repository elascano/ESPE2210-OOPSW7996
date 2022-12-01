
package trashbin.model;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class TrashBin {
    
    private int Id;
    private String material;
    private String color;

    /**
     * @return the Id
     */
    
    public TrashBin(int Id, String material, String color){
        
        this.Id = Id;
        this.material = material;
        this.color = color;      
                
    }
            
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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


    
    

