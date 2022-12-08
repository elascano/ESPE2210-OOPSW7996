package ec.edu.espe.CupProducer.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Cup {

   

    private int id;
    private String Material;
    private String color;

    public Cup() {
        id = 0;
        Material = "";
        color = "";
    }
    
    @Override
    public String toString() {
        return "Cup{" + "id=" + id + ", Material=" + Material + ", color=" + color + '}';
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
     * @return the Material
     */
    public String getMaterial(String next) {
        return Material;
    }

    /**
     * @param Material the Material to set
     */
    public void setMaterial(String Material) {
        this.Material = Material;
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

    public String getMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
