package ec.edu.espe.CupProducer.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Cup {

   

    private int id;
    private String materialCup;
    private String colorCup;

    public Cup() {
        id = 0;
        materialCup = "";
        colorCup = "";
    }
    
    @Override
    public String toString() {
        return "Cup{" + "id=" + id + ", Material=" + materialCup + ", color=" + colorCup + '}';
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
        return materialCup;
    }

    /**
     * @param Material the Material to set
     */
    public void setMaterial(String Material) {
        this.materialCup = Material;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return colorCup;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.colorCup = color;
    }

    public String getMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
